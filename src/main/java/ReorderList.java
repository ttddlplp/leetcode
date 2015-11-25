public class ReorderList {
    public void reorderList(ListNode head) {
        if (head == null) {
            return;
        }

        ListNode step1 = head;
        ListNode step2 = head;

        while(step2.next != null && step2.next.next != null) {
            step1 = step1.next;
            step2 = step2.next.next;
        }

        ListNode reverse2ndHalf = reverse(step1.next);

        step1.next = null;
        ListNode start = head;
        while (reverse2ndHalf != null) {
            ListNode startN = start.next;
            ListNode secondHalfN = reverse2ndHalf.next;

            start.next = reverse2ndHalf;
            reverse2ndHalf.next = startN;

            start = startN;
            reverse2ndHalf = secondHalfN;
        }
    }

    protected ListNode reverse(ListNode listNode) {
        if (listNode == null) {
            return listNode;
        }
        ListNode previousNode = null;
        ListNode last = listNode;

        while (last != null) {
            ListNode nextNode = last.next;
            last.next = previousNode;
            previousNode = last;
            last = nextNode;
        }
        return previousNode;
    }
}
