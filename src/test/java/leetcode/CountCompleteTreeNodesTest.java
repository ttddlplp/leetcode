package leetcode;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CountCompleteTreeNodesTest {

    private CountCompleteTreeNodes count;

    @Before
    public void setUp() throws Exception {
        count = new CountCompleteTreeNodes();
    }

    @Test
    public void test1() throws Exception {
        TreeNode treeNode = TreeNode.fromString("1,2,3");
        assertEquals(3, count.countNodes(treeNode));
    }

    @Test
    public void test2() throws Exception {
        TreeNode treeNode = TreeNode.fromString("1,2,3,#,4");
        assertEquals(2, count.countNodes(treeNode));
    }
}
