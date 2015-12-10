package leetcode;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class RemoveLinkedListTest {

    private RemoveLinkedList removeLinkedList;

    @Before
    public void setUp() throws Exception {
        removeLinkedList = new RemoveLinkedList();
    }

    @Test
    public void test1() throws Exception {
        ListNode testList = new ListNode.Builder(5).with(3).with(7).with(1).build();
        ListNode expected = new ListNode.Builder(5).with(7).with(1).build();
        ListNode actual = removeLinkedList.removeElements(testList, 3);
        assertEquals(expected, actual);
    }
    
    @Test
    public void testRemoveMultiple() throws Exception {
        ListNode testList = new ListNode.Builder(5).with(3).with(7).with(3).build();
        ListNode expected = new ListNode.Builder(5).with(7).build();
        ListNode actual = removeLinkedList.removeElements(testList, 3);
        assertEquals(expected, actual);
    }
    
    @Test
    public void testNotRemoveAnything() throws Exception {
        ListNode testList = new ListNode.Builder(5).with(3).with(7).with(3).build();
        ListNode actual = removeLinkedList.removeElements(testList, 15);
        assertEquals(testList, actual);
    }
    
    @Test
    public void testRemoveAll() throws Exception {
        ListNode testList = new ListNode.Builder(5).build();
        ListNode actual = removeLinkedList.removeElements(testList, 5);
        assertNull(actual);
    }
    
    @Test
    public void testFailed1() throws Exception {
        ListNode testList = new ListNode.Builder(1).with(2).with(2).with(1).build();
        ListNode expected = new ListNode.Builder(1).with(1).build();
        ListNode actual = removeLinkedList.removeElements(testList, 2);
        assertEquals(expected, actual);
    }
    
    @Test
    public void testNull() throws Exception {
        ListNode actual = removeLinkedList.removeElements(null, 5);
        assertNull(actual);
    }
}
