

public class AddTwoNumberLink {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode root = null;
        ListNode previousNode = null;
        int added = 0;
        for (ListNode node1 = l1, node2 = l2;
             node1 != null || node2 != null || added != 0;
             node1 = getNextOrNull(node1), node2 = getNextOrNull(node2)
                ) {
            int total = getValueOrZeroIfNull(node1) + getValueOrZeroIfNull(node2) + added;
            int val = total % 10;
            added = total / 10;
            ListNode currentNode = new ListNode(val);
            if (previousNode != null) {
                previousNode.next = currentNode;
            } else {
                root = currentNode;
            }
            previousNode = currentNode;
        }
        return root;
    }

    private ListNode getNextOrNull(ListNode node) {
        if (node == null) {
            return null;
        } else {
            return node.next;
        }
    }

    private int getValueOrZeroIfNull(ListNode node) {
        if (node == null) {
            return 0;
        } else {
            return node.val;
        }
    }
}