package leetcode;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * Created by gaoxiangzeng-personal on 15/12/15.
 */
public class BSTIteratorTest {
    @Test
    public void test1() throws Exception {
        TreeNode treeNode = TreeNode.fromString("4,2,6,1,3,5,7");
        BSTIterator bstIterator = new BSTIterator(treeNode);
        List<Integer> actual = new ArrayList<>();

        while (bstIterator.hasNext()) {
            actual.add(bstIterator.next());
        }

        assertEquals(Arrays.asList(1,2,3,4,5,6,7), actual);
    }

    @Test
    public void test2() throws Exception {
        TreeNode treeNode = TreeNode.fromString("4,2,#,1,#,5,#");
        BSTIterator bstIterator = new BSTIterator(treeNode);
        List<Integer> actual = new ArrayList<>();

        while (bstIterator.hasNext()) {
            actual.add(bstIterator.next());
        }

        assertEquals(Arrays.asList(5,1,2,4), actual);
    }

    @Test
    public void test3() throws Exception {
        TreeNode treeNode = TreeNode.fromString("4,#,6,#,3,#,7");
        BSTIterator bstIterator = new BSTIterator(treeNode);
        List<Integer> actual = new ArrayList<>();

        while (bstIterator.hasNext()) {
            actual.add(bstIterator.next());
        }

        assertEquals(Arrays.asList(4,6,3,7), actual);
    }
}