package leetcode;

public class NumMatrix {
    private int[][] cache;

    public NumMatrix(int[][] matrix) {
        if (matrix != null && matrix[0] != null) {
            int width = matrix[0].length;
            cache = new int[matrix.length + 1][width + 1];
            for (int i = 0; i < width; i++) {
                cache[0][i] = 0;
            }

            for (int i = 0; i < matrix.length; i++) {
                cache[i][0] = 0;
            }

            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < width; j++) {
                    cache[i + 1][j + 1] = matrix[i][j] +
                            cache[i][j + 1] + cache[i + 1][j] - cache[i][j];
                }
            }
        }
    }

    public int sumRegion(int row1, int col1, int row2, int col2) {
        if (cache == null) {
            return 0;
        }

        if (cache.length > row2 - 1 || cache[0].length > col2 - 1) {
            return 0;
        }
        return cache[row2 + 1][col2 + 1] -
                cache[row1][col2 + 1] - cache[row2 + 1][col1]
                + cache[row1][col1];
    }

    public static void main(String[] args) {
        NumMatrix numMatrix = new NumMatrix(new int[1][]);
    }


}