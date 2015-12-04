/**
 * Created by gaoxiangzeng-personal on 15/12/3.
 */
public class MinimumRotatedArrayII {
    public int findMin(int[] nums) {
        int start = 0;
        int end = nums.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] < nums[end]) {
                end = mid;
            } else if (nums[end] < nums[mid]) {
                start = mid + 1;
            } else {
                end = end - 1;
            }
        }
        return nums[start];
    }
}
