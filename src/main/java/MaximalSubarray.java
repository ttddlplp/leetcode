public class MaximalSubarray {
    public int maxSubArray(int[] nums) {
        if (nums == null || nums.length == 0) {
            return Integer.MIN_VALUE;
        }
        
        int sum = 0;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (sum > max) {
                max = sum;
            }
            
            if (sum < 0) {
                sum = 0;
            }
        }
        return max;
    }
}
