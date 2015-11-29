import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * Created by gaoxiangzeng-personal on 15/11/25.
 */
public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }

    public static TreeNode fromString(String s) {
        String[] split = s.split(",");

        TreeNode root = new TreeNode(Integer.valueOf(split[0]));
        int i = 1;
        Queue<TreeNode> visit = new LinkedBlockingQueue<>();
        visit.add(root);
        while (i < split.length) {
            TreeNode next = visit.poll();
            String nextVal = split[i++];
            if (!nextVal.equals("#")) {
                next.left = new TreeNode(Integer.valueOf(nextVal));
                visit.add(next.left);
            }

            if (i >= split.length) {
                break;
            }
            nextVal = split[i++];
            if (!nextVal.equals("#")) {
                next.right = new TreeNode(Integer.valueOf(nextVal));
                visit.add(next.right);
            }
        }

        return root;
    }
}

