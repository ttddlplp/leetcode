package leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by gaoxiangzeng-personal on 15/12/10.
 */
public class CopyListRandomPointer {
    public RandomListNode copyRandomList(RandomListNode head) {
        if (head == null) {
            return null;
        }
        Map<Integer, RandomListNode> map = new HashMap<>();

        RandomListNode newHead = null;

        RandomListNode current = head;
        RandomListNode newPrevious = null;
        while(current != null) {
            RandomListNode newNode = new RandomListNode(current.label);
            map.put(newNode.label, newNode);
            if (newHead == null) {
                newHead = newNode;
                newPrevious = newHead;
            } else {
                newPrevious.next = newNode;
                newPrevious = newPrevious.next;
            }
            current = current.next;
        }

        current = head;
        newPrevious = newHead;
        while (current != null) {
            if (current.random != null) {
                newPrevious.random = map.get(current.random.label);
            }
            current = current.next;
            newPrevious = newPrevious.next;
        }
        return newHead;
    }
}
