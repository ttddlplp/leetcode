package leetcode;

public class MaximalSquare {
    public int maximalSquare(char[][] matrix) {
        if (matrix == null || matrix.length == 0 || matrix[0] == null || matrix[0].length == 0) {
            return 0;
        }
        int[][] dp = new int[matrix.length + 1][matrix[0].length + 1];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == '0') {
                    dp[i + 1][j + 1] = 0;
                } else {
                    dp[i + 1][j + 1] = Math.min(Math.min(dp[i][j + 1], dp[i + 1][j]), dp[i][j]) + 1;
                }
            }
        }

        int max = -1;
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[i].length; j++) {
                if (max < dp[i][j]) {
                    max = dp[i][j];
                }
            }
        }
        
        return max * max;
    }
}
