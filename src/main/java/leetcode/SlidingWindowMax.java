package leetcode;

import java.util.Deque;
import java.util.LinkedList;

public class SlidingWindowMax {
    public int[] maxSlidingWindow(int[] nums, int k) {
        if (nums == null || nums.length == 0 || k <= 0 || k > nums.length) {
            return new int[]{};
        }

        int n = nums.length;
        int[] result = new int[n - k + 1];
        Deque<Integer> maxQueue = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            if (!maxQueue.isEmpty() && i - k == maxQueue.peek()) {
                maxQueue.poll();
            }

            while (!maxQueue.isEmpty() && nums[maxQueue.peekLast()] < nums[i] ) {
                maxQueue.pollLast();
            }
            maxQueue.add(i);

            if (i - k + 1 >= 0){
                result[i - k + 1] = nums[maxQueue.peekFirst()];
            }
        }
        return result;
    }
}
