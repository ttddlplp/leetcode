package leetcode;

import com.google.common.collect.ImmutableList;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * Created by gaoxiangzeng-personal on 15/12/12.
 */
public class BinaryTreeRightViewTest {

    private BinaryTreeRightView binaryTreeRightView;

    @Before
    public void setUp() throws Exception {
        binaryTreeRightView = new BinaryTreeRightView();
    }

    @Test
    public void test1() throws Exception {
        TreeNode treeNode = TreeNode.fromString("1,2,3,#,5,#,4");
        List<Integer> result = binaryTreeRightView.rightSideView(treeNode);
        assertEquals(ImmutableList.of(1,3,4), result);
    }


    @Test
    public void test2() throws Exception {
        TreeNode treeNode = TreeNode.fromString("1,2,#,3,#,4,#");
        List<Integer> result = binaryTreeRightView.rightSideView(treeNode);
        assertEquals(ImmutableList.of(1,2,3,4), result);
    }

    @Test
    public void test3() throws Exception {
        TreeNode treeNode = TreeNode.fromString("1,2,#,3,#,4,5");
        List<Integer> result = binaryTreeRightView.rightSideView(treeNode);
        assertEquals(ImmutableList.of(1,2,3,5), result);
    }
}