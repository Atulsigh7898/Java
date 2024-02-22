import java.util.*;

class Solution3 {
    public int findJudge(int n, int[][] trust) {
        // Initialize arrays to count the trusts for each person
        int[] trustCounts = new int[n + 1];
        int[] trustedByCounts = new int[n + 1];
        
        // Iterate through the trust array to count trusts
        for (int[] relation : trust) {
            int a = relation[0];
            int b = relation[1];
            trustCounts[a]++;
            trustedByCounts[b]++;
        }
        
        // Check for a person who is trusted by all others and trusts no one
        for (int i = 1; i <= n; i++) {
            if (trustCounts[i] == 0 && trustedByCounts[i] == n - 1) {
                return i; // Found the town judge
            }
        }
        
        return -1; // No town judge found
    }
}
