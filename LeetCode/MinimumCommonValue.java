import java.util.*;

public class MinimumCommonValue {
    public static int findMinimumCommonValue(int[] arr1, int[] arr2) {
        Set<Integer> set1 = new HashSet<>();
        for (int num : arr1) {
            set1.add(num);
        }
        
        int minCommon = Integer.MAX_VALUE;
        for (int num : arr2) {
            if (set1.contains(num)) {
                minCommon = Math.min(minCommon, num);
            }
        }
        
        return minCommon == Integer.MAX_VALUE ? -1 : minCommon; // return -1 if no common value found
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 3, 5, 7, 9};
        int[] arr2 = {2, 4, 6, 8, 10};
        int minCommonValue = findMinimumCommonValue(arr1, arr2);
        if (minCommonValue != -1) {
            System.out.println("Minimum common value: " + minCommonValue);
        } else {
            System.out.println("No common value found.");
        }
    }
}
