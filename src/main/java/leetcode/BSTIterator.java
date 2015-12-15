package leetcode;

import java.util.Stack;

/**
 * Created by gaoxiangzeng-personal on 15/12/15.
 */
public class BSTIterator {
    Stack<TreeNode> cache = new Stack<>();

    public BSTIterator(TreeNode root) {
        TreeNode current = root;
        while (current != null) {
            cache.push(current);
            current = current.left;
        }
    }

    /** @return whether we have a next smallest number */
    public boolean hasNext() {
        return !cache.empty();
    }

    /** @return the next smallest number */
    public int next() {
        if (cache.empty()) {
            return 0;
        }

        TreeNode result = cache.pop();
        if (result.right != null) {
            cache.push(result.right);

            TreeNode current = result.right.left;
            while (current != null) {
                cache.push(current);
                current = current.left;
            }
        }

        return result.val;
    }
}
