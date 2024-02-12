import java.util.*;

public class LongestSubstringWithoutRepeatingCharacters {
    public static int lengthOfLongestSubstring(String s) {
        if (s == null || s.length() == 0)
            return 0;

        int maxLength = 0;
        int n = s.length();
        HashMap<Character, Integer> charIndexMap = new HashMap<>();

        for (int i = 0, j = 0; j < n; j++) {
            char c = s.charAt(j);
            if (charIndexMap.containsKey(c)) {
                i = Math.max(charIndexMap.get(c) + 1, i); // Move i to the right of the last occurrence of c
            }
            maxLength = Math.max(maxLength, j - i + 1); // Update maxLength
            charIndexMap.put(c, j); // Update the index of character c
        }
        return maxLength;
    }

    public static void main(String[] args) {
        String s = "abcabcbb";
        System.out.println("Length of the longest substring without repeating characters: " + lengthOfLongestSubstring(s));
    }
}
