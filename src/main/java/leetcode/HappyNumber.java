package leetcode;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by gaoxiangzeng-personal on 15/12/6.
 */
public class HappyNumber {
    public boolean isHappy(int n) {
        Set<Integer> set = new HashSet<>();
        while (n != 1) {
            int current = n;
            int sum = 0;
            while (current > 0) {
                int lastDigit = current % 10;
                sum += lastDigit * lastDigit;
                current /= 10;
            }
            n = sum;
            if (set.contains(sum)) {
                break;
            } else {
                set.add(sum);
            }
        }
        return n == 1;
    }
}
