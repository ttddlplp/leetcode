package leetcode;

public class RemoveLinkedList {
    public ListNode removeElements(ListNode head, int val) {
        ListNode current = head;


        ListNode previous = null;
        while (current != null) {
            while (current != null && current.val != val) {
                previous = current;
                current = current.next;
            }

            if (current != null) {
                if (previous == null) {
                    head = current.next;
                } else {
                    previous.next = current.next;
                }
                current = current.next;
            }
        }
        
        return head;
    }
}
