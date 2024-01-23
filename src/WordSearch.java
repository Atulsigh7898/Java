import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class WordSearch {

    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Usage: java WordSearch <file_path> <word_to_search>");
            return;
        }

        String filePath = args[0];
        String wordToSearch = args[1];

        try {
            char[][] grid = readGridFromFile(filePath);
            boolean found = searchWord(grid, wordToSearch);

            if (found) {
                System.out.println("Word found in the grid!");
            } else {
                System.out.println("Word not found in the grid.");
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }

    private static char[][] readGridFromFile(String filePath) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(filePath));
        String line;
        int numRows = 0;
        int numCols = 0;

        // Determine the dimensions of the grid
        while ((line = reader.readLine()) != null) {
            numRows++;
            numCols = Math.max(numCols, line.length());
        }

        // Create a 2D array to store the grid
        char[][] grid = new char[numRows][numCols];

        // Reset the reader to the beginning of the file
        reader = new BufferedReader(new FileReader(filePath));

        // Populate the grid with characters from the file
        int row = 0;
        while ((line = reader.readLine()) != null) {
            for (int col = 0; col < line.length(); col++) {
                grid[row][col] = line.charAt(col);
            }
            row++;
        }

        return grid;
    }

    private static boolean searchWord(char[][] grid, String word) {
        int numRows = grid.length;
        int numCols = grid[0].length;

        // Check horizontally
        for (int row = 0; row < numRows; row++) {
            for (int col = 0; col <= numCols - word.length(); col++) {
                if (checkWord(grid, word, row, col, 0, 1)) {
                    return true;
                }
            }
        }

        // Check vertically
        for (int col = 0; col < numCols; col++) {
            for (int row = 0; row <= numRows - word.length(); row++) {
                if (checkWord(grid, word, row, col, 1, 0)) {
                    return true;
                }
            }
        }

        return false;
    }

    private static boolean checkWord(char[][] grid, String word, int startRow, int startCol, int rowIncrement, int colIncrement) {
        int length = word.length();

        for (int i = 0; i < length; i++) {
            if (grid[startRow + i * rowIncrement][startCol + i * colIncrement] != word.charAt(i)) {
                return false;
            }
        }

        return true;
    }
}
