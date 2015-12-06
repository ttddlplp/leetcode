import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by gaoxiangzeng-personal on 15/12/6.
 */
public class InsertionSortListTest {

    private InsertionSortList insertionSortList;

    @Before
    public void setUp() throws Exception {
        insertionSortList = new InsertionSortList();
    }

    @Test
    public void test1() throws Exception {
        ListNode result =
                insertionSortList.insertionSortList(
                        new ListNode.Builder(4).with(3).with(5).with(6).build()
                );
        ListNode expected = new ListNode.Builder(3).with(4).with(5).with(6).build();
        assertEquals(expected, result);

    }

    @Test
    public void test2() throws Exception {
        ListNode result =
                insertionSortList.insertionSortList(
                        new ListNode.Builder(6).with(5).with(4).with(3).build()
                );
        ListNode expected = new ListNode.Builder(3).with(4).with(5).with(6).build();
        assertEquals(expected, result);

    }

    @Test
    public void test3() throws Exception {
        ListNode result =
                insertionSortList.insertionSortList(
                        new ListNode.Builder(5).with(5).with(5).with(5).build()
                );
        ListNode expected = new ListNode.Builder(5).with(5).with(5).with(5).build();
        assertEquals(expected, result);
    }

    @Test
    public void test4() throws Exception {
        ListNode result =
                insertionSortList.insertionSortList(
                        new ListNode.Builder(5).build()
                );
        ListNode expected = new ListNode.Builder(5).build();
        assertEquals(expected, result);
    }

    @Test
    public void test5() throws Exception {
        ListNode result =
                insertionSortList.insertionSortList(
                        new ListNode.Builder(4).with(2).with(1).with(3).build()
                );
        ListNode expected = new ListNode.Builder(1).with(2).with(3).with(4).build();
        assertEquals(expected, result);
    }
}