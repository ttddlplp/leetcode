package leetcode;

public class CountCompleteTreeNodes {
    public int countNodes(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int leftNum = countNodes(root.left);
        int rightNum = countNodes(root.right);

        if (leftNum - rightNum > 1 || leftNum - rightNum < 0) {
            return 0;
        }

        return leftNum + rightNum + 1;
    }
}
