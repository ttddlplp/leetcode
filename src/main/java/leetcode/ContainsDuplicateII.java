package leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by gaoxiangzeng-personal on 15/12/6.
 */
public class ContainsDuplicateII {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        if (nums == null || k < 1) {
            return false;
        }
        Map<Integer, Integer> map = new HashMap<>(nums.length);

        for (int i = 0; i < nums.length; ++i) {
            if (map.containsKey(nums[i])) {
                int lastIndex = map.get(nums[i]);
                if (i - lastIndex <= k) {
                    return true;
                }
            }
            map.put(nums[i], i);
        }
        return false;
    }

    public boolean containsNearbyDuplicateSlow(int[] nums, int k) {
        if (nums == null || k < 1) {
            return false;
        }
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; ++i) {
            if (map.containsKey(nums[i])) {
                int lastIndex = map.get(nums[i]);
                if (i - lastIndex <= k) {
                    return true;
                }
            }
            map.put(nums[i], i);
        }
        return false;
    }
}
