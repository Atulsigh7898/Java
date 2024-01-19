public class MatrixExample {
    public static void main(String[] args) {
        // Define a 2D matrix
        int rows = 3;
        int columns = 4;
        int[][] matrix = new int[rows][columns];

        // Populate the matrix
        int count = 1;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = count++;
            }
        }

        // Display the matrix
        System.out.println("Matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        // Access an element in the matrix
        int rowToAccess = 1;
        int columnToAccess = 2;
        int element = matrix[rowToAccess][columnToAccess];
        System.out.println("\nElement at position (" + rowToAccess + ", " + columnToAccess + "): " + element);

        // Perform some operations on the matrix
        int sum = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                sum += matrix[i][j];
            }
        }
        System.out.println("\nSum of all elements in the matrix: " + sum);
    }
}

