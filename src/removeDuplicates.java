import java.io.*;

public class removeDuplicates {

    public static int removeDuplicates(int[] nums) {
        if (nums.length <= 2) {
            return nums.length;
        }

        int index = 2;

        for (int i = 2; i < nums.length; i++) {
            if (nums[i] != nums[index - 2]) {
                nums[index++] = nums[i];
            }
        }

        return index;
    }

    public static void main(String[] args) {
        int[] nums = {1, 1, 1, 2, 2, 3};
        int length = removeDuplicates(nums);

        System.out.println("New length: " + length);
        System.out.print("Modified Array: ");
        for (int i = 0; i < length; i++) {
            System.out.print(nums[i] + " ");
        }

        // If you want to write the modified array to a file
        try (PrintWriter writer = new PrintWriter(new FileWriter("output.txt"))) {
            for (int i = 0; i < length; i++) {
                writer.print(nums[i] + " ");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
