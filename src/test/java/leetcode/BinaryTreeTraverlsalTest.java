package leetcode;

import org.junit.Before;
import org.junit.Test;

/**
 * Created by gaoxiangzeng-personal on 15/11/25.
 */
public class BinaryTreeTraverlsalTest {

    private BinaryTreeTraverlsal traverlsal;

    @Before
    public void setUp() throws Exception {
        traverlsal = new BinaryTreeTraverlsal();
    }

    @Test
    public void testBuildTree() throws Exception {
        TreeNode treeNode = traverlsal.buildTree(new int[]{1, 2, 4, 5, 3, 7, 6, 8}, new int[]{4, 2, 5, 1, 6, 7, 3, 8});
        System.out.println(treeNode);
    }

    @Test
    public void testName() throws Exception {
        TreeNode treeNode = traverlsal.buildTree(new int[]{}, new int[]{});
        System.out.println(treeNode);

    }
}