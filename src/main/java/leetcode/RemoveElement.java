package leetcode;

/**
 * Created by gaoxiangzeng-personal on 15/12/6.
 */
public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            if (nums[start] == val) {
                int tmp = nums[end];
                nums[end] = nums[start];
                nums[start] = tmp;
                end--;
            } else {
                start++;
            }
        }
        return start;
    }
}
