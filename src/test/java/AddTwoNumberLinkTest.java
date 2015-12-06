import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by gaoxiangzeng-personal on 15/11/22.
 */
public class AddTwoNumberLinkTest {
    @Test
    public void testNormal() throws Exception {
        AddTwoNumberLink addTwoNumberLink = new AddTwoNumberLink();
        ListNode list1 = new ListNode.Builder(2).with(4).with(3).build();
        ListNode list2 = new ListNode.Builder(5).with(6).with(4).build();
        ListNode expected = new ListNode.Builder(7).with(0).with(8).build();

        ListNode actual = addTwoNumberLink.addTwoNumbers(list1, list2);
        assertEquals(expected, actual);
    }

    @Test
    public void testNotEqualLength() throws Exception {
        AddTwoNumberLink addTwoNumberLink = new AddTwoNumberLink();
        ListNode list1 = new ListNode.Builder(2).with(4).build();
        ListNode list2 = new ListNode.Builder(5).with(6).with(4).build();
        ListNode expected = new ListNode.Builder(7).with(0).with(5).build();

        ListNode actual = addTwoNumberLink.addTwoNumbers(list1, list2);
        assertEquals(expected, actual);
    }
    @Test
    public void testNextTen() throws Exception {
        AddTwoNumberLink addTwoNumberLink = new AddTwoNumberLink();
        ListNode list1 = new ListNode.Builder(5).build();
        ListNode list2 = new ListNode.Builder(5).build();
        ListNode expected = new ListNode.Builder(0).with(1).build();

        ListNode actual = addTwoNumberLink.addTwoNumbers(list1, list2);
        assertEquals(expected, actual);
    }

    @Test
    public void testNextTen2() throws Exception {
        AddTwoNumberLink addTwoNumberLink = new AddTwoNumberLink();
        ListNode list1 = new ListNode.Builder(1).build();
        ListNode list2 = new ListNode.Builder(9).with(9).build();
        ListNode expected = new ListNode.Builder(0).with(0).with(1).build();

        ListNode actual = addTwoNumberLink.addTwoNumbers(list1, list2);
        assertEquals(expected, actual);
    }
}