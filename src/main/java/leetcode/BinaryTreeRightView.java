package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by gaoxiangzeng-personal on 15/12/12.
 */
public class BinaryTreeRightView {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root == null) {
            return result;
        }

        visit(root, result, 0);
        return result;
    }

    private void visit(TreeNode root, List<Integer> result, int level) {
        if (root == null) {
            return;
        }
        if (result.size() - 1 < level || result.get(level) == null) {
            result.add(level, root.val);
        }
        visit(root.right, result, level + 1);
        visit(root.left, result, level + 1);
    }
}
