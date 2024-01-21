import java.util.Arrays;

public class SortColors {

    public static void main(String[] args) {
        // Example input: an array of colors represented as strings
        String[] colors = {"red", "green", "blue", "green", "red", "blue"};

        // Sorting the colors
        sortColors(colors);

        // Printing the sorted colors
        System.out.println(Arrays.toString(colors));
    }

    public static void sortColors(String[] colors) {
        if (colors == null || colors.length <= 1) {
            return; // No need to sort if the array is empty or has only one element
        }

        int redIndex = 0;
        int greenIndex = 0;
        int blueIndex = colors.length - 1;

        while (greenIndex <= blueIndex) {
            String currentColor = colors[greenIndex];

            switch (currentColor) {
                case "red":
                    swap(colors, redIndex, greenIndex);
                    redIndex++;
                    greenIndex++;
                    break;

                case "green":
                    greenIndex++;
                    break;

                case "blue":
                    swap(colors, greenIndex, blueIndex);
                    blueIndex--;
                    break;
            }
        }
    }

    private static void swap(String[] colors, int i, int j) {
        String temp = colors[i];
        colors[i] = colors[j];
        colors[j] = temp;
    }
}
