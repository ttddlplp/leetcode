package leetcode;

/**
 * Created by gaoxiangzeng-personal on 15/12/12.
 */
public class RotateArray {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        if (nums == null || n == 0 || k <= 0) {
            return;
        }
        k %= n;

        reverse(nums, 0, n - k - 1);
        reverse(nums, n - k, n - 1);
        reverse(nums, 0, n - 1);
    }

    private void reverse(int[] nums, int left, int right) {
        while (left <= right) {
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
        }
    }
}
