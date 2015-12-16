package leetcode;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by gaoxiangzeng-personal on 15/12/13.
 */
public class TreeInorderPostorderTest {

    private TreeInorderPostorder treeInorderPostorder;

    @Before
    public void setUp() throws Exception {
        treeInorderPostorder = new TreeInorderPostorder();
    }

    @Test
    public void test1() throws Exception {
        int[] in = new int[] {4,2,5,1,6,3,7};
        int[] post = new int[] {4,5,2,6,7,3,1};

        TreeNode treeNode = treeInorderPostorder.buildTree(in, post);
        TreeNode expected = TreeNode.fromString("1,2,3,4,5,6,7");
        assertEquals(expected, treeNode);
    }

    @Test
    public void test2() throws Exception {
        int[] in = new int[] {2,1};
        int[] post = new int[] {2,1};

        TreeNode treeNode = treeInorderPostorder.buildTree(in, post);
        TreeNode expected = TreeNode.fromString("1,2");
        assertEquals(expected, treeNode);
    }

    @Test
    public void test3() throws Exception {
        int[] in = new int[] {1};
        int[] post = new int[] {1};

        TreeNode treeNode = treeInorderPostorder.buildTree(in, post);
        TreeNode expected = TreeNode.fromString("1");
        assertEquals(expected, treeNode);
    }

    @Test
    public void test4() throws Exception {
        int[] in = new int[] {4,2,1};
        int[] post = new int[] {4,2,1};

        TreeNode treeNode = treeInorderPostorder.buildTree(in, post);
        TreeNode expected = TreeNode.fromString("1,2,#,4");
        assertEquals(expected, treeNode);
    }

    @Test
    public void test5() throws Exception {
        int[] in = new int[] {1,2};
        int[] post = new int[] {2,1};

        TreeNode treeNode = treeInorderPostorder.buildTree(in, post);
        TreeNode expected = TreeNode.fromString("1,#,2");
        assertEquals(expected, treeNode);
    }
}