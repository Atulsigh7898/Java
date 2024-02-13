public class PalindromeFinder {
    public static String findFirstPalindrome(String[] words) {
        for (String word : words) {
            if (isPalindrome(word)) {
                return word;
            }
        }
        return "";
    }

    private static boolean isPalindrome(String word) {
        int left = 0;
        int right = word.length() - 1;

        while (left < right) {
            if (word.charAt(left) != word.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        String[] words = {"level", "hello", "radar", "world"};
        String result = findFirstPalindrome(words);
        if (!result.isEmpty()) {
            System.out.println("First palindromic string: " + result);
        } else {
            System.out.println("No palindromic string found.");
        }
    }
}
