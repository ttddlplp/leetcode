package leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by gaoxiangzeng-personal on 15/11/22.
 */
public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        if (nums == null) {
            return null;
        }

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i + 1);
        }

        for (int i = 0; i < nums.length; i++) {
            int another = target - nums[i];
            if (map.containsKey(another)) {
                Integer index = map.get(another);
                if (another == nums[i] && index == i + 1) {
                    continue;
                }

                int[] result = new int[2];
                result[0] = Math.min(index, i + 1);
                result[1] = Math.max(index, i + 1);
                return result;
            }
        }
        return null;
    }
}
