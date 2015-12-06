package leetcode;

/**
 * Created by gaoxiangzeng-personal on 15/12/4.
 */
public class LinkedListCycle {
    public boolean hasCycle(ListNode head) {
        if (head == null) {
            return false;
        }

        ListNode step1 = head;
        ListNode step2 = head;

        while (step2.next != null && step2.next.next != null) {
            step1 = step1.next;
            step2 = step2.next.next;

            if (step1 == step2) {
                return true;
            }
        }
        return false;
    }
}
