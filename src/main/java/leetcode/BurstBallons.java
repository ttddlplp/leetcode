package leetcode;

/**
 * Created by gaoxiangzeng-personal on 15/12/10.
 */
public class BurstBallons {
    public int maxCoins(int[] nums) {
        int[] nums2 = new int[nums.length + 2];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                nums2[i + 1] = nums[i];
            }
        }
        nums2[0] = nums2[nums.length + 1] = 1;

        int n = nums2.length;
        int[][] dp = new int[n][n];

        for (int k = 2; k < n; k++) {
            for (int left = 0; left < n - k; left++) {
                int right = left + k;
                for (int i = left + 1; i < right; i++) {
                    dp[left][right] = Math.max(dp[left][right], nums2[left] * nums2[i] * nums2[right] + dp[left][i] + dp[i][right]);
                }
            }
        }

        return dp[0][n - 1];
    }
}
