/**
 * Created by gaoxiangzeng-personal on 15/12/6.
 */
public class InsertionSortList {
    public ListNode insertionSortList(ListNode head) {
        if (head == null) {
            return null;
        }

        ListNode result = null;
        ListNode current = head;
        while (current != null) {
            ListNode tmp = current;
            current = current.next;
            tmp.next = null;
            result = insert(tmp, result);
        }
        return result;
    }

    private ListNode insert(ListNode insert, ListNode node) {
        if (node == null) {
            return insert;
        }

        ListNode current = node;
        ListNode previous = null;
        while (current != null) {
            if (insert.val > current.val) {
                previous = current;
                current = current.next;
            } else {
                break;
            }
        }
        if (previous != null) {
            ListNode oldNext = previous.next;
            previous.next = insert;
            insert.next = oldNext;
            return node;
        } else {
            insert.next = current;
            return insert;
        }
    }
}
