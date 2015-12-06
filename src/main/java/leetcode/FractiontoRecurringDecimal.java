package leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by gaoxiangzeng-personal on 15/12/5.
 */
public class FractiontoRecurringDecimal {
    public String fractionToDecimal(int numerator1, int denominator1) {
        long num = numerator1;
        long den = denominator1;

        if (den == 0) {
            return "";
        }

        StringBuilder sb = new StringBuilder();
        if (Math.abs(num + den) != Math.abs(num) + Math.abs(den)) {
            sb.append("-");
        }
        num = Math.abs(num);
        den = Math.abs(den);
        long beforeDot = num / den;
        sb.append(beforeDot);
        if (num % den == 0) {
            return sb.toString();
        } else {
            sb.append(".");
            StringBuilder sbAfterDot = new StringBuilder();
            long remainder = num % den;
            int maxLength = 99;
            int i = 0;
            Map<Long, Integer> remainderMap = new HashMap<>();
            while (remainder != 0) {
                if (i == maxLength) {
                    break;
                }
                if (remainderMap.containsKey(remainder)) {
                    sbAfterDot.insert(remainderMap.get(remainder ), "(");
                    sbAfterDot.append(")");
                    break;
                } else {
                    num = remainder * 10;
                    remainderMap.put(remainder, i);
                    long current = num / den;
                    sbAfterDot.append(current);
                    remainder = num % den;
                    i++;
                }
            }
            sb.append(sbAfterDot);
        }
        return sb.toString();
    }
}
