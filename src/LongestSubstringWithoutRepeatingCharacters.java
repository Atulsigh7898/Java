import java.util.HashMap;

public class LongestSubstringWithoutRepeatingCharacters {
    public static int lengthOfLongestSubstring(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }

        int maxLength = 0;
        int start = 0;
        HashMap<Character, Integer> charIndexMap = new HashMap<>();

        for (int end = 0; end < s.length(); end++) {
            char currentChar = s.charAt(end);

            if (charIndexMap.containsKey(currentChar)) {
                // Move the start pointer to the right of the last occurrence of the current character
                start = Math.max(charIndexMap.get(currentChar) + 1, start);
            }

            // Update the character index
            charIndexMap.put(currentChar, end);

            // Update the maximum length
            maxLength = Math.max(maxLength, end - start + 1);
        }

        return maxLength;
    }

    public static void main(String[] args) {
        String input = "abcabcbb";
        int result = lengthOfLongestSubstring(input);
        System.out.println("Longest Substring Without Repeating Characters: " + result);
    }
}
