package leetcode;

import org.junit.Before;
import org.junit.Test;

/**
 * Created by gaoxiangzeng-personal on 15/11/29.
 */
public class BinaryInorderTraversalTest {

    private BinaryInorderTraversal binaryInorderTraversal;

    @Before
    public void setUp() throws Exception {
        binaryInorderTraversal = new BinaryInorderTraversal();
    }

    @Test
    public void test1() throws Exception {
        TreeNode treeNode = TreeNode.fromString("1,#,2,3");
        System.out.println(binaryInorderTraversal.inorderTraversal(treeNode));

    }
}