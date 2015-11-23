/**
 * Created by gaoxiangzeng-personal on 15/11/22.
 */
public class NumArrayMutable {
    private final TreeNode sumTree;

    public NumArrayMutable(int[] nums) {
        int n = nums.length;
        int[] sum = new int[n + 1];
        for (int i = 0; i < n; i++) {
            sum[i + 1] = sum[i] + nums[i];
        }
        if (n == 0) {
            sumTree = new TreeNode(0, 0, 0);
        } else {
            sumTree = formTree(sum, 0, n - 1);
        }
    }

    private TreeNode formTree(int[] sum, int start, int end) {
        TreeNode root = new TreeNode(sumRangeFromArray(sum, start, end), start, end);
        if (start == end) {
            return root;
        }
        int mid = start + (end - start) / 2;
        root.left = formTree(sum, start, mid);
        root.right = formTree(sum, mid + 1, end);
        return root;
    }

    private int sumRangeFromArray(int[] sum, int start, int end) {
        return sum[end + 1] - sum[start];
    }

    void update(int i, int val) {
        if (i > sumTree.end || i < 0) {
            return;
        }
        updateTree(sumTree, i, val);
    }

    private int updateTree(TreeNode sumTree, int i, int val) {
        if (sumTree.start == i && sumTree.end == i) {
            int oldVal = sumTree.val;
            sumTree.val = val;
            return val - oldVal;
        }

        int mid = sumTree.start + (sumTree.end - sumTree.start) / 2;
        int diff;
        if (i <= mid) {
            diff = updateTree(sumTree.left, i, val);
        } else {
            diff = updateTree(sumTree.right, i , val);
        }
        sumTree.val += diff;
        return diff;
    }

    public int sumRange(int i, int j) {
        if (i < 0 || j > sumTree.end) {
            throw new RuntimeException();
        }

        return findSumOfTree(sumTree, i, j);
    }

    private int findSumOfTree(TreeNode sumTree, int start, int end) {
        if (sumTree.start == start && sumTree.end == end) {
            return sumTree.val;
        }

        int mid = sumTree.start + (sumTree.end - sumTree.start) / 2;
        if (start > mid) {
            return findSumOfTree(sumTree.right, start, end);
        } else if (end <= mid) {
            return findSumOfTree(sumTree.left, start, end);
        } else {
            return findSumOfTree(sumTree.left, start, mid) + findSumOfTree(sumTree.right, mid + 1, end);
        }
    }

    class TreeNode {
        int val;
        int start;
        int end;
        TreeNode left;
        TreeNode right;
        TreeNode(int x, int start, int end) {
            val = x;
            this.start = start;
            this.end = end;
        }
    }

}
