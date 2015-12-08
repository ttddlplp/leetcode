package leetcode;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by gaoxiangzeng-personal on 15/12/8.
 */
public class PartitionListTest {

    private PartitionList partitionList;

    @Before
    public void setUp() throws Exception {
        partitionList = new PartitionList();
    }

    @Test
    public void test1() throws Exception {
        ListNode testNode = new ListNode.Builder(1).with(4).with(3).with(2).with(5).with(2).build();
        ListNode expectNode = new ListNode.Builder(1).with(2).with(2).with(4).with(3).with(5).build();
        ListNode partition = partitionList.partition(testNode, 3);
        assertEquals(expectNode, partition);
    }
}