import java.util.*;

public class MaxFrequencyElements {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 4, 4, 4, 5, 5, 5, 5};
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        
        // Count the frequency of each element
        for (int num : arr) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }
        
        // Find the maximum frequency
        int maxFrequency = Collections.max(frequencyMap.values());
        
        // Count elements with maximum frequency
        int count = 0;
        for (int freq : frequencyMap.values()) {
            if (freq == maxFrequency) {
                count++;
            }
        }
        
        System.out.println("Elements with maximum frequency:");
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            if (entry.getValue() == maxFrequency) {
                System.out.println(entry.getKey());
            }
        }
        
        System.out.println("Maximum frequency: " + maxFrequency);
        System.out.println("Count of elements with maximum frequency: " + count);
    }
}
