/**
 * Created by gaoxiangzeng-personal on 15/12/1.
 */
public class DivideTwoInteger {
    public int divide(int dividend, int divisor) {
        if (divisor == 0) {
            return Integer.MAX_VALUE;
        }
        int result = 0;

        boolean negativeResult = false;
        int val = Math.abs(dividend + divisor);
        if (val < Math.max(Math.abs(dividend), Math.abs(divisor))) {
            negativeResult = true;
        }
        dividend = Math.abs(dividend);
        divisor = Math.abs(divisor);
        while (dividend >= divisor) {
            result ++;
            dividend -= divisor;
        }

        return negativeResult ? 0 - result : result;
     }
}
