package leetcode;

import java.util.Objects;

/**
 * Created by gaoxiangzeng-personal on 15/11/22.
 */
public class ListNode {
    int val;
    ListNode next;
    ListNode before;
    ListNode(int x) { val = x; }


    @Override
    public String toString() {
        return val + "-" + next;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ListNode listNode = (ListNode) o;
        return Objects.equals(val, listNode.val) &&
                Objects.equals(next, listNode.next);
    }

    @Override
    public int hashCode() {
        return Objects.hash(val, next);
    }

    public static class Builder {
        ListNode listNode;
        ListNode currentNode;
        public Builder(int val) {
            listNode = new ListNode(val);
            currentNode = listNode;
        }

        public Builder with(int val) {
            currentNode.next = new ListNode(val);
            currentNode = currentNode.next;
            return this;
        }

        public ListNode build() {
            return listNode;
        }
    }
}
