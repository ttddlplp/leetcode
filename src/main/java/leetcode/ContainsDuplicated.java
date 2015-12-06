package leetcode;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by gaoxiangzeng-personal on 15/12/6.
 */
public class ContainsDuplicated {
    public boolean containsDuplicate(int[] nums) {
        if (nums == null) {
            return false;
        }
        Set<Integer> sets = new HashSet<>();
        for (int num : nums) {
            if (sets.contains(num)) {
                return true;
            } else {
                sets.add(num);
            }
        }
        return false;
    }
}
