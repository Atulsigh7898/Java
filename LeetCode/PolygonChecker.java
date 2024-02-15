import java.util.Arrays;

public class PolygonChecker {
    public static boolean canFormPolygon(int[] nums) {
        // Sorting the array in non-decreasing order
        Arrays.sort(nums);

        // Iterating through the array
        for (int i = 0; i < nums.length - 2; i++) {
            // Checking if the sum of two smallest elements is greater than the largest element
            if (nums[i] + nums[i + 1] > nums[i + 2]) {
                return true; // Polygon can be formed
            }
        }

        return false; // Polygon cannot be formed
    }

    public static void main(String[] args) {
        int[] nums = {3, 4, 5, 6}; // Example array of positive integers
        if (canFormPolygon(nums)) {
            System.out.println("The array can form a polygon.");
        } else {
            System.out.println("The array cannot form a polygon.");
        }
    }
}
