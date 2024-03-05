public class MinLengthAfterDeletingSimilarEnds {
    public static int minLength(String s) {
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            if (s.charAt(left) == s.charAt(right)) {
                // If characters at both ends are similar, remove them
                left++;
                right--;
            } else {
                // If characters at both ends are different, we can't remove anymore
                break;
            }
        }

        // The length of the remaining string
        return right - left + 1;
    }

    public static void main(String[] args) {
        String input = "aabcaaba";
        int minLength = minLength(input);
        System.out.println("Minimum length after deleting similar ends: " + minLength);
    }
}
