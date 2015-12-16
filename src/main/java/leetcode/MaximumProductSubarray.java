package leetcode;

/**
 * Created by gaoxiangzeng-personal on 15/12/13.
 */
public class MaximumProductSubarray {
    public int maxProduct(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int max;
        int min;

        int result = max = min = nums[0];
        for (int i = 1; i < nums.length; i++) {
            int tmpMax = max;
            max = Math.max(max * nums[i], Math.max(min * nums[i], nums[i]));
            min = Math.min(tmpMax * nums[i], Math.min(min * nums[i], nums[i]));
            result = Math.max(result, max);
        }
        return result;
    }
}
