package leetcode;

/**
 * Created by gaoxiangzeng-personal on 15/12/8.
 */
public class PartitionList {
    public ListNode partition(ListNode head, int x) {
        if (head == null) {
            return null;
        }

        ListNode startDummy = new ListNode(-1);
        ListNode midDummy = new ListNode(-1);

        ListNode start = startDummy;
        ListNode mid = midDummy;

        ListNode current = head;
        while (current != null) {
            ListNode next = current.next;
            current.next = null;
            if (current.val < x) {
                start.next = current;
                start = start.next;
            } else {
                mid.next = current;
                mid = mid.next;
            }
            current = next;
        }
        start.next = midDummy.next;
        return startDummy.next;
    }
}
