import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by gaoxiangzeng-personal on 15/11/24.
 */
public class ReorderListTest {
    @Test
    public void testReverse() throws Exception {
        ListNode listNode = new ListNode.Builder(5).addNextAndReturn(6).addNextAndReturn(8).build();
        ReorderList reorderList = new ReorderList();
        System.out.println(reorderList.reverse(listNode));
        assertEquals(listNode, reorderList.reverse(reorderList.reverse(listNode)));
    }

    @Test
    public void testName() throws Exception {
        ListNode listNode = new ListNode.Builder(1).addNextAndReturn(2).addNextAndReturn(3).build();
        ReorderList reorderList = new ReorderList();
        reorderList.reorderList(listNode);
        System.out.println(listNode);
    }
}