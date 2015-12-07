package leetcode;

/**
 * Created by gaoxiangzeng-personal on 15/12/7.
 */
public class RangeSumQuery2DImmutable {
    int[][] cache;
    public RangeSumQuery2DImmutable(int[][] matrix) {
        if (matrix != null && matrix.length != 0){
            cache = new int[matrix.length + 1][matrix[0].length + 1];
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                    cache[i + 1][j + 1] = cache[i + 1][j] + cache[i][j + 1] - cache[i][j] + matrix[i][j];
                }
            }
        }
    }

    public int sumRegion(int row1, int col1, int row2, int col2) {
        if (cache == null || row1 < 0 || col1 < 0 || row2 < 0 || col2 < 0) {
            return 0;
        }

        return cache[row2 + 1][col2 + 1] - cache[row2 + 1][col1] - cache[row1][col2 + 1] + cache[row1][col1];
    }
}
