package leetcode;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

/**
 * Created by gaoxiangzeng-personal on 15/12/6.
 */
public class LowestCommonAncestorTest {

    private LowestCommonAncestor lowestCommonAncestor;

    @Before
    public void setUp() throws Exception {
        lowestCommonAncestor = new LowestCommonAncestor();
    }

    @Test
    public void test1() throws Exception {
        TreeNode root = TreeNode.fromString("6,2,8,0,4,7,9,#,#,3,5");
        TreeNode treeNode = lowestCommonAncestor.lowestCommonAncestor(root, new TreeNode(2), new TreeNode(8));
        assertEquals(6, treeNode.val);
    }

    @Test
    public void test2() throws Exception {
        TreeNode root = TreeNode.fromString("6,2,8,0,4,7,9,#,#,3,5");
        TreeNode treeNode = lowestCommonAncestor.lowestCommonAncestor(root, new TreeNode(10), new TreeNode(8));
        assertNull(treeNode);
    }

    @Test
    public void test3() throws Exception {
        TreeNode root = TreeNode.fromString("6,2,8,0,4,7,9,#,#,3,5");
        TreeNode treeNode = lowestCommonAncestor.lowestCommonAncestor(root, new TreeNode(5), new TreeNode(4));
        assertEquals(4, treeNode.val);
    }
}