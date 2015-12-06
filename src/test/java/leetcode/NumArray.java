package leetcode;

public class NumArray {
    private int[] cache;

    public NumArray(int[] nums) {
        if (nums == null) {
            throw new RuntimeException();
        }

        cache = new int[nums.length + 1];

        for (int i = 0; i < nums.length; i++) {
            cache[i + 1] = cache[i] + nums[i];
        }
    }

    public int sumRange(int i, int j) {
        return cache[j + 1] - cache[i];
    }
}