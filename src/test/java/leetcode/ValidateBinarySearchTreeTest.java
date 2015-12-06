package leetcode;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by gaoxiangzeng-personal on 15/12/3.
 */
public class ValidateBinarySearchTreeTest {

    private ValidateBinarySearchTree validateBinarySearchTree;

    @Before
    public void setUp() throws Exception {
        validateBinarySearchTree = new ValidateBinarySearchTree();
    }

    @Test
    public void testName() throws Exception {
        assertFalse(validateBinarySearchTree.isValidBST(TreeNode.fromString("1,#,2,3")));
    }

    @Test
    public void test2() throws Exception {
        assertTrue(validateBinarySearchTree.isValidBST(TreeNode.fromString("1,#,3,2")));
    }
}