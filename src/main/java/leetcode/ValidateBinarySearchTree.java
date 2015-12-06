package leetcode;

import java.util.Stack;

/**
 * Created by gaoxiangzeng-personal on 15/12/3.
 */
public class ValidateBinarySearchTree {
    public boolean isValidBST(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        TreeNode currentNode = root;
        long min = (long)Integer.MIN_VALUE - 1;
        while (currentNode != null || !stack.empty()) {
            if (currentNode != null) {
                stack.push(currentNode);
                currentNode = currentNode.left;
            } else {
                currentNode = stack.pop();
                if (currentNode.val <= min) {
                    return false;
                }
                min = currentNode.val;
                currentNode = currentNode.right;
            }
        }
        return true;
    }
}
