package leetcode;

/**
 * Created by gaoxiangzeng-personal on 15/12/3.
 */
public class MinimumRotatedArray {
    public int findMin(int[] nums) {
        if (nums == null || nums.length == 0) {
            throw new RuntimeException();
        }

        int start = 0;
        int end = nums.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] < nums[end]) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }

        return nums[start];
    }
}
