package leetcode;

/**
 * Created by gaoxiangzeng-personal on 15/12/5.
 */
public class SingleNumberIII {
    public int[] singleNumber(int[] nums) {
        int start = nums[0];

        for (int i = 1; i < nums.length; i++) {
            start ^= nums[i];
        }

        int lowbit = start & -start;

        int a = 0;
        int b = 0;

        for (int num : nums) {
            if ((num & lowbit) == 0) {
                a ^= num;
            } else {
                b ^= num;
            }
        }
        return new int[]{a, b};
    }
}
