/**
 * Created by gaoxiangzeng-personal on 15/12/6.
 */
public class ReverseNodesK {
    public ListNode reverseKGroup(ListNode head, int k) {
        if (head == null || k <= 0) {
            return head;
        }

        ListNode current = head;
        ListNode previous = null;
        while (current != null) {
            ListNode kth = getKth(current, k);

            if (kth != null) {
                ListNode oldNext = kth.next;
                kth.next = null;

                ListNode first = reverse(current);
                if (previous != null) {
                    previous.next = first;
                } else {
                    head = first;
                }
                previous = current;
                current = oldNext;
            } else {
                if (previous != null){
                    previous.next = current;
                }
                break;
            }
        }
        return head;
    }

    private ListNode reverse(ListNode first) {
        if (first == null || first.next == null) {
            return first;
        }

        ListNode second = first.next;
        first.next = null;
        ListNode newFirst = reverse(second);
        second.next = first;
        return newFirst;
    }

    private ListNode getKth(ListNode current, int k) {
        for (int i = 0; i < k - 1 && current != null; i++) {
            current = current.next;
        }
        return current;
    }
}
