/*
package leetcode;

import java.util.*;

*/
/**
 * Created by gaoxiangzeng-personal on 15/12/12.
 *//*

public class CountSmallerNumberRight {
    public List<Integer> countSmaller(int[] nums) {
        Set<Integer> indexes = new TreeSet<>();
        for (int num : nums) {
            indexes.add(num);
        }
        Map<Integer, Integer> indexMap = new HashMap<>();
        int i = 0;
        for (Integer index : indexes) {
            indexMap.put(index, i);
        }

        int[] frequencies = new int[indexes.size()];
        for (int num : nums) {
            frequencies[indexMap.get(num)]++;
        }

        for (int j = 1; j < frequencies.length; j++) {
            frequencies[j] += frequencies[j - 1];
        }

        SegmentTreeNode node = new SegmentTreeNode(frequencies);

        List<Integer> result = new ArrayList<>(nums.length);
        result.add(nums.length - 1, 0);
        for (int j = nums.length - 2; j >= 0; j++) {
        }


        return null;
    }


}

class SegmentTreeNode {
    public SegmentTreeNode left;
    public SegmentTreeNode right;
    public int val;
    public int start;
    public int end;


    SegmentTreeNode(int val, int start, int end) {
        this.val = val;
        this.start = start;
        this.end = end;

        if (left != right) {
            int mid = start + (end - start) / 2;
            left = new SegmentTreeNode(val, start, mid);
            right = new SegmentTreeNode(val, mid + 1, end);
        }
    }

    public int add(int start, int end, int val) {
        this.val += val;
        if (start < this.start) {
            this.start = start;
        }

        if (end > this.end) {
            this.end = end;
        }

        if (left == null || right == null) {
            int mid = start + (end - start) / 2;
            left = new SegmentTreeNode(val, start, mid);
            right = new SegmentTreeNode(val, mid + 1, end);
        } else {
            if (pos < left.end) {
                left.add(pos, val);
            } else {
                right.add(pos, val);
            }
        }
    }

    public int get(int start, int end) {
        if (start < this.start || end > this.end) {
            throw new RuntimeException();
        }

        if (start == this.start && end == this.end) {
            return val;
        }

        if (end < left.end) {
            return left.get(start, end);
        }

        if (start > right.start) {
            return right.get(start, end);
        }

        return left.get(start, left.end) + right.get(right.start, end);
    }
}
*/
