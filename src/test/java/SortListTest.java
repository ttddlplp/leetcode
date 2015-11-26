import org.junit.Before;
import org.junit.Test;

public class SortListTest {

    private SortList sortList;

    @Before
    public void setUp() throws Exception {
        sortList = new SortList();
    }

    @Test
    public void testSort() throws Exception {
        ListNode listNode = new ListNode.Builder(3).addNextAndReturn(15)
                .addNextAndReturn(4)
                .addNextAndReturn(7)
                .addNextAndReturn(19)
                .build();
        ListNode listNode1 = sortList.sortList(listNode);
        System.out.println(listNode1);
    }

    @Test
    public void testOne() throws Exception {
        ListNode listNode = new ListNode(5);
        System.out.println(sortList.sortList(listNode));
    }
    
    @Test
    public void testNull() throws Exception {
        ListNode listNode = null;
        System.out.println(sortList.sortList(listNode));
    }
}
