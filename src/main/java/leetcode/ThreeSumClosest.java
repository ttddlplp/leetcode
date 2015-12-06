package leetcode;

import java.util.Arrays;

/**
 * Created by gaoxiangzeng-personal on 15/11/23.
 */
public class ThreeSumClosest {
    public int threeSumClosest(int[] nums, int target) {
        if (nums == null || nums.length < 3) {
            return 0;
        }

        Arrays.sort(nums);

        int val = 0;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < nums.length - 2; i++) {
            int low = i + 1;
            int high = nums.length - 1;

            while(low < high) {

                int sum = nums[i] + nums[low] + nums[high];
                int diff = Math.abs(target - sum);
                if (diff < min) {
                    min = diff;
                    val = sum;
                }

                if (sum == target) {
                    return sum;
                }

                if (sum > target) {
                    high --;
                } else {
                    low ++;
                }
            }
        }
        return val;
    }
}
