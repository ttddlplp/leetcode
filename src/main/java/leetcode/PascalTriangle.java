package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by gaoxiangzeng-personal on 15/11/29.
 */
public class PascalTriangle {
    public List<List<Integer>> generate(int numRows) {
        int zeroIndexRow = numRows - 1;
        List<List<Integer>> result = new ArrayList<>();
        if (zeroIndexRow < 0) {
            return result;
        }

        Integer[] dp = new Integer[zeroIndexRow + 1];
        dp[0] = 1;
        result.add(Arrays.asList(Arrays.copyOfRange(dp, 0, 1)));

        for (int i = 1; i <= zeroIndexRow; i++) {
            dp[i] = 1;
            for (int j = i - 1; j > 0; j--) {
                dp[j] += dp[j - 1];
            }
            result.add(Arrays.asList(Arrays.copyOfRange(dp, 0, i + 1)));
        }

        return result;
    }
}
