package leetcode;

/**
 * Created by gaoxiangzeng-personal on 15/12/13.
 */
public class TreeInorderPostorder {
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        if (inorder == null || postorder == null || inorder.length == 0 || inorder.length != postorder.length) {
            return null;
        }

        return buildTreeHelper(inorder, 0, inorder.length - 1, postorder, 0, postorder.length - 1);
    }

    private TreeNode buildTreeHelper(int[] inorder, int inStart, int inEnd, int[] postorder, int postStart, int postEnd) {
        int root = postorder[postEnd];
        TreeNode rootNode = new TreeNode(root);
        if (inStart == inEnd && postStart == postEnd) {
            return rootNode;
        }

        int rootInPos = 0;
        while(inorder[inStart + rootInPos] != root) {
            rootInPos++;
        }

        int numOfrightElements = inEnd - rootInPos - inStart;

        int postRightTreeStart = postEnd - numOfrightElements;

        if (numOfrightElements > 0) {
            rootNode.right = buildTreeHelper(inorder, inStart + rootInPos + 1, inEnd, postorder, postRightTreeStart, postEnd - 1);
        }
        if (rootInPos > 0) {
            rootNode.left = buildTreeHelper(inorder, inStart, inStart + rootInPos - 1, postorder, postStart, postRightTreeStart - 1);
        }

        return rootNode;
    }


}
