package leetcode;

import java.util.Arrays;

/**
 * Created by gaoxiangzeng-personal on 15/11/22.
 */
public class PerfectSquare {
    public int numSquares(int n) {
        if (n < 0) {
            return Integer.MAX_VALUE;
        }

        int[] dp = new int[n + 1];
        Arrays.fill(dp, Integer.MAX_VALUE);

        for (int i = 0; i * i <= n; i++) {
            dp[i * i] = 1;
        }

        for (int i = 1; i < n; i++) {
            for (int j = 1; i + j * j <= n; j++) {
                dp[i + j * j] = Math.min(dp[i] + 1, dp[i + j * j]);
            }
        }
        return dp[n];
    }
}
