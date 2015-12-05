/**
 * Created by gaoxiangzeng-personal on 15/12/5.
 */
public class BestTimeStockIII {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        if (prices == null || n == 0) {
            return 0;
        }

        int[] leftProfit = new int[n];
        int minPrice = prices[0];
        int leftMaxProfit = 0;
        for (int i = 1; i < n; i++) {
            if (minPrice > prices[i]) {
                minPrice = prices[i];
            } else {
                leftMaxProfit = Math.max(leftMaxProfit, prices[i] - minPrice);
            }
            leftProfit[i] = leftMaxProfit;
        }

        int maxProfit = leftProfit[n - 1];
        int maxRightPrice = prices[n - 1];
        int rightMaxProfit = 0;

        for (int i = n - 2; i >= 0; i--) {
            if (maxRightPrice < prices[i]) {
                maxRightPrice = prices[i];
            } else {
                rightMaxProfit = Math.max(rightMaxProfit, maxRightPrice - prices[i]);
            }
            maxProfit = Math.max(maxProfit, rightMaxProfit + leftProfit[i]);
        }
        return maxProfit;
    }
}
