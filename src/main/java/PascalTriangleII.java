import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by gaoxiangzeng-personal on 15/11/29.
 */
public class PascalTriangleII {
    public List<Integer> getRow(int rowIndex) {
        if (rowIndex < 0) {
            return new ArrayList<>();
        }

        Integer[] dp = new Integer[rowIndex + 1];
        dp[0] = 1;

        for (int i = 1; i <= rowIndex; i++) {
            dp[i] = 1;
            for (int j = i - 1; j > 0; j--) {
                dp[j] += dp[j - 1];
            }
        }
        return Arrays.asList(dp);
    }
}
