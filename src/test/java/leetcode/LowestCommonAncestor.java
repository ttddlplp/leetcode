package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by gaoxiangzeng-personal on 15/12/6.
 */
public class LowestCommonAncestor {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null || p == null || q == null) {
            return null;
        }

        List<TreeNode> pPath = find(root, p);
        List<TreeNode> qPath = find(root, q);

        if (pPath == null || qPath == null) {
            return null;
        }

        for(int i = pPath.size() - 2, j = qPath.size() - 2; i >= 0 || j >= 0; --i, --j) {
            if (i < 0 || j < 0) {
                return i < 0 ? qPath.get(j + 1) : pPath.get(i + 1);
            }

            if (pPath.get(i).val != qPath.get(j).val) {
                return pPath.get(i + 1);
            }
        }
        return null;
    }

    private List<TreeNode> find(TreeNode root, TreeNode p) {
        if (root == null) {
            return null;
        }

        if (root.val == p.val) {
            ArrayList<TreeNode> result = new ArrayList<>();
            result.add(p);
            return result;
        }

        List<TreeNode> result = find(root.left, p);
        result = result != null ? result : find(root.right, p);
        if (result != null) {
            result.add(root);
        }
        return result;
    }
}
