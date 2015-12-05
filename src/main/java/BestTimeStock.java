/**
 * Created by gaoxiangzeng-personal on 15/12/5.
 */
public class BestTimeStock {
    public int maxProfit(int[] prices) {
        if (prices == null | prices.length == 0) {
            return 0;
        }

        int sum = 0;
        int max = 0;
        for (int i = 1; i < prices.length; i++) {
            int diff = prices[i] - prices[i - 1];
            sum += diff;
            if (sum < 0) {
                sum = 0;
            }
            if (sum > max) {
                max = sum;
            }
        }
        return max;
    }
}
