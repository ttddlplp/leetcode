package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by gaoxiangzeng-personal on 15/12/5.
 */
public class KthLarge {
    public int findKthLargest(int[] nums, int k) {
        if (nums == null || nums.length == 0 || k < 1 || k > nums.length) {
            return 0;
        }

        List<Integer> list = new ArrayList<>();
        for (int num : nums) {
            list.add(num);
        }
        return findKth(list, k);
    }

    private int findKth(List<Integer> nums, int k) {
        int mid = nums.size() / 2;

        int pivot = nums.get(mid);

        List<Integer> smaller = new ArrayList<>();
        List<Integer> larger = new ArrayList<>();

        for (Integer num : nums) {
            if (num > pivot) {
                larger.add(num);
            } else if(num < pivot) {
                smaller.add(num);
            }
        }

        if (k <= larger.size()) {
            return findKth(larger, k);
        } else if (k > nums.size() - smaller.size()) {
            return findKth(smaller, k - (nums.size() - smaller.size()));
        } else {
            return nums.get(mid);
        }
    }
}
