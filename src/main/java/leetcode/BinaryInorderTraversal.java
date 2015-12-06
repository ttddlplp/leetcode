package leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Created by gaoxiangzeng-personal on 15/11/29.
 */
public class BinaryInorderTraversal {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root == null) {
            return result;
        }

        Stack<TreeNode> stack = new Stack<>();

        TreeNode currentNode = root;
        while (currentNode != null || !stack.empty()) {
            if (currentNode != null) {
                stack.push(currentNode);
                currentNode = currentNode.left;
            } else {
                currentNode = stack.pop();
                result.add(currentNode.val);
                currentNode = currentNode.right;
            }
        }
        return result;
    }
}
