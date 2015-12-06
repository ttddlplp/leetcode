package leetcode;

/**
 * Created by gaoxiangzeng-personal on 15/11/22.
 */
public class ReverseInteger {
    public int reverse(int x) {
        boolean isNegtive = false;
        int num = x;
        if (x < 0) {
            isNegtive = true;
            num *= -1;
        }
        StringBuilder sb = new StringBuilder();

        while (num > 0) {
            sb.append(num % 10);
            num /= 10;
        }
        if (sb.toString().isEmpty()) {
            return 0;
        }
        try {
            int result = Integer.valueOf(sb.toString());
            return isNegtive ? result * -1 : result;
        } catch (Exception e) {
            return 0;
        }
    }
}
