package leetcode;

/**
 * Created by gaoxiangzeng-personal on 15/12/6.
 */
public class RemoveDuplicatedFromSortedArray {
    public int removeDuplicates(int[] nums) {
        if (nums == null | nums.length == 0) {
            return 0;
        }

        int end = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[end] != nums[i]) {
                end++;
                if (end != i) {
                    nums[end] = nums[i];
                }
            }
        }
        return end + 1;
    }
}
