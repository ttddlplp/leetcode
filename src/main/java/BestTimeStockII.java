/**
 * Created by gaoxiangzeng-personal on 15/12/5.
 */
public class BestTimeStockII {
    public int maxProfit(int[] prices) {
        if (prices == null || prices.length == 0) {
            return 0;
        }

        int sum = 0;
        int totalProfit = 0;

        for (int i = 1; i < prices.length; i++) {
            int diff = prices[i] - prices[i - 1];

            if (diff < 0) {
                totalProfit += sum;
                sum = 0;
            } else {
                sum += diff;
            }
        }

        return totalProfit + sum;
    }
}
