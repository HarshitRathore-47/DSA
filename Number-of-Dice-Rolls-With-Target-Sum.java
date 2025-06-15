// Memoization
class Solution {
    public static int numRollsToTarget(int n, int k, int target) {
        int[][] dp = new int[n + 1][target + 1];
        for (int[] d : dp)
            Arrays.fill(d, -1);
        return helper(n, k, target, dp);
    }

    public static int helper(int n, int k, int target, int[][] dp) {
        if (n == 0 && target == 0) {
            dp[n][target] = 1;
        }
        if (n == 0 && target != 0 || n != 0 && target == 0) {
            return 0;
        }

        if (dp[n][target] != -1) {
            return dp[n][target];
        }
        
        int ans = 0;
        int mod = 1000_000_007;
        for (int i = 1; i <= k; i++) {
            if (target - i >= 0)
            ans = (ans + helper(n - 1, k, target - i, dp)) % mod;
            dp[n][target] = ans;
        }

        return ans;
    }

}