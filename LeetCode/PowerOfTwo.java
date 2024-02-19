public class PowerOfTwo {
    public static boolean isPowerOfTwo(int n) {
        // A power of two has only one bit set to 1
        // If n is a power of two, then n & (n - 1) will be 0
        // For example, 8 (1000) & 7 (0111) = 0
        return n > 0 && (n & (n - 1)) == 0;
    }

    public static void main(String[] args) {
        int n = 16;
        System.out.println("Is " + n + " a power of two? " + isPowerOfTwo(n));
    }
}
