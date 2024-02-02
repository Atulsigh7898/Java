public class UniqueBSTs1 {

    public static int numUniqueBSTs(int n) {
        if (n <= 0) {
            return 0;
        }

        int[] dp = new int[n + 1];
        dp[0] = 1;
        dp[1] = 1;

        for (int i = 2; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                dp[i] += dp[j - 1] * dp[i - j];
            }
        }

        return dp[n];
    }

    public static void main(String[] args) {
        // Example usage:
        int n = 3;
        int result = numUniqueBSTs(n);
        System.out.println("Number of structurally unique BSTs with " + n + " nodes: " + result);
    }
}
