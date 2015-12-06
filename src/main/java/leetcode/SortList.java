package leetcode;

public class SortList {
    public ListNode sortList(ListNode head) {
        if (head == null) {
            return null;
        }
        
        if (head.next == null) {
            return head;
        }
        
        ListNode step1 = head;
        ListNode step2 = head;
        
        while (step2.next != null && step2.next.next != null) {
            step1 = step1.next;
            step2 = step2.next.next;
        }
        
        ListNode secondStart = step1.next;
        step1.next = null;

        ListNode firstStart = sortList(head);
        secondStart = sortList(secondStart);
        
        return merge(firstStart, secondStart);
    }

    private ListNode merge(ListNode firstStart, ListNode secondStart) {
        ListNode head = new ListNode(0);
        ListNode current = head;
        while (firstStart != null && secondStart != null) {
            if (firstStart.val < secondStart.val) {
                current.next = firstStart;
                firstStart = firstStart.next;
            } else {
                current.next = secondStart;
                secondStart = secondStart.next;
            }
            current = current.next;
        }
        
        while (firstStart != null) {
            current.next = firstStart;
            firstStart = firstStart.next;
            current = current.next;
        }
        
        while (secondStart != null) {
            current.next = secondStart;
            secondStart = secondStart.next;
            current = current.next;
        }

        return head.next;
    }
}
