package leetcode;

/**
 * Created by gaoxiangzeng-personal on 15/12/14.
 */
public class Atoi {
    public int myAtoi(String str) {
        if (str == null || str.isEmpty()) {
            return 0;
        }

        str = str.trim();
        int negtive = 1;
        int startIndex = 0;
        if (str.startsWith("-")) {
            negtive = -1;
            startIndex = 1;
        }

        if (str.startsWith("+")) {
            negtive = 1;
            startIndex = 1;
        }

        long result = 0;
        for (int i = startIndex; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c < 48 || c > 57) {
                break;
            }
            result *= 10;
            result += c - 48;
            if (result > Integer.MAX_VALUE) {
                break;
            }

            if (result < Integer.MIN_VALUE) {
                break;
            }
        }

        result *= negtive;

        if (result > Integer.MAX_VALUE) {
            return Integer.MAX_VALUE;
        }

        if (result < Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        }

        return (int) result;
    }
}
