package leetcode;

public class ClimbingStair {
    public int climbStairs(int n) {
        if (n <= 0) {
            return 0;
        } else if (n <= 2) {
            return n;
        }
        
        int[] dp = new int[n];
        dp[0] = 1;
        dp[1] = 2;
        for (int i = 2; i < n; i++) {
            dp[i] = dp[i - 2] + dp[i - 1];
        }
        return dp[n - 1];
    }
}
