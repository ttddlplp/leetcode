import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by gaoxiangzeng-personal on 15/12/6.
 */
public class ReverseNodesKTest {

    private ReverseNodesK reverseNodesK;

    @Before
    public void setUp() throws Exception {
        reverseNodesK = new ReverseNodesK();
    }

    @Test
    public void test1() throws Exception {
        ListNode result = reverseNodesK.reverseKGroup(new ListNode(5), 1);
        assertEquals(new ListNode(5), result);
    }

    @Test
    public void test2() throws Exception {
        ListNode result = reverseNodesK.reverseKGroup(new ListNode(5), 10);
        assertEquals(new ListNode(5), result);
    }

    @Test
    public void test3() throws Exception {
        ListNode result = reverseNodesK.reverseKGroup(new ListNode.Builder(5).with(7).build(), 10);
        assertEquals(new ListNode.Builder(5).with(7).build(), result);
    }

    @Test
    public void test4() throws Exception {
        ListNode result = reverseNodesK.reverseKGroup(new ListNode.Builder(1).with(2).with(3).with(4).with(5).build(), 2);
        assertEquals(new ListNode.Builder(2).with(1).with(4).with(3).with(5).build(), result);
    }

    @Test
    public void test5() throws Exception {
        ListNode result = reverseNodesK.reverseKGroup(new ListNode.Builder(1).with(2).with(3).with(4).with(5).build(), 3);
        assertEquals(new ListNode.Builder(3).with(2).with(1).with(4).with(5).build(), result);
    }

    @Test
    public void test6() throws Exception {
        ListNode result = reverseNodesK.reverseKGroup(new ListNode.Builder(1).with(2).with(3).with(4).with(5).build(), 1);
        assertEquals(new ListNode.Builder(1).with(2).with(3).with(4).with(5).build(), result);
    }
}