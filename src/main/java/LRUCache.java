import java.util.HashMap;
import java.util.Map;

public class LRUCache {
    final Map<Integer, ListNode> cache;
    ListNode link;
    ListNode head = new ListNode(-1, -1);
    ListNode end = new ListNode(-1, -1);
    private final int capacity;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        cache = new HashMap<>(capacity);
        head.next = end;
        end.before = head;
    }

    public int get(int key) {
        if (!cache.containsKey(key)) {
            return -1;
        }

        ListNode newFirst = cache.get(key);
        ListNode newFirstBefore = newFirst.before;
        newFirstBefore.next = newFirst.next;
        newFirst.next.before = newFirstBefore;

        ListNode oldNext = head.next;
        head.next = newFirst;
        newFirst.before = head;
        newFirst.next = oldNext;
        oldNext.before = newFirst;
        return newFirst.val;
    }

    public void set(int key, int value) {
        if (!cache.containsKey(key) && cache.size() == capacity) {
            ListNode oldBefore = end.before;
            end.before = oldBefore.before;
            end.before.next = end;
            cache.remove(oldBefore.key);
        }

        ListNode newNext;
        if (!cache.containsKey(key)) {
            newNext = new ListNode(key, value);
            cache.put(key, newNext);
        } else {
            newNext = cache.get(key);
            newNext.val = value;
            ListNode newNextBefore = newNext.before;
            newNextBefore.next = newNext.next;
            newNext.next.before = newNextBefore;
        }

        ListNode oldNext = head.next;
        head.next = newNext;
        newNext.before = head;
        newNext.next = oldNext;
        oldNext.before = newNext;
    }

    class ListNode {
        int key;
        int val;
        ListNode next;
        ListNode before;
        ListNode(int key, int x) {this.key = key; val = x; }
    }
}