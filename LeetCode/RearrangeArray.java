import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RearrangeArray {
    public static void main(String[] args) {
        int[] nums = {1, -3, 2, -4, 5, -6};
        rearrangeArray(nums);
        System.out.println(Arrays.toString(nums));
    }

    public static void rearrangeArray(int[] nums) {
        List<Integer> positive = new ArrayList<>();
        List<Integer> negative = new ArrayList<>();

        // Separate positive and negative integers
        for (int num : nums) {
            if (num >= 0) {
                positive.add(num);
            } else {
                negative.add(num);
            }
        }

        // Alternate adding positive and negative integers into the original array
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < positive.size() && j < negative.size()) {
            nums[k++] = positive.get(i++);
            nums[k++] = negative.get(j++);
        }

        // Add remaining positive integers if any
        while (i < positive.size()) {
            nums[k++] = positive.get(i++);
        }

        // Add remaining negative integers if any
        while (j < negative.size()) {
            nums[k++] = negative.get(j++);
        }
    }
}
