package leetcode;

/**
 * Created by gaoxiangzeng-personal on 15/11/25.
 */
public class BinaryTreeTraverlsal {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if (preorder == null || inorder == null || preorder.length == 0 || inorder.length == 0) {
            return null;
        }
        return build(preorder, 0, inorder, 0, inorder.length - 1);
    }

    private TreeNode build(int[] preorder, int i, int[] inorder, int left, int right) {
        if (left > right) {
            return null;
        }

        if (left == right) {
            return new TreeNode(inorder[left]);
        }

        int rootVal = preorder[i];
        TreeNode root = new TreeNode(rootVal);

        int midIndex = -1;
        for (int j = left; j <= right; j++) {
            if (inorder[j] == rootVal) {
                midIndex = j;
                break;
            }
        }

        root.left = build(preorder, i + 1, inorder, left, midIndex - 1);
        root.right = build(preorder, i + midIndex - left + 1, inorder, midIndex + 1, right);
        return root;
    }
}
