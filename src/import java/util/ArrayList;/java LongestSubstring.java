// import java.util.HashMap;

// public class LongestSubstring {

//     public static int lengthOfLongestSubstring(String s) {
//         HashMap<Character, Integer> charIndexMap = new HashMap<>();
//         int start = 0;
//         int maxLength = 0;

//         for (int end = 0; end < s.length(); end++) {
//             char currentChar = s.charAt(end);

//             if (charIndexMap.containsKey(currentChar) && charIndexMap.get(currentChar) >= start) {
//                 start = charIndexMap.get(currentChar) + 1;
//             }

//             charIndexMap.put(currentChar, end);
//             maxLength = Math.max(maxLength, end - start + 1);
//         }

//         return maxLength;
//     }

//     public static void main(String[] args) {
//         String s = "abcabcbb";
//         int result = lengthOfLongestSubstring(s);
//         System.out.println("Length of the longest substring without repeating characters: " + result);
//     }
// }
