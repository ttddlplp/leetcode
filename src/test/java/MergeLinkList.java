/**
 * Created by gaoxiangzeng-personal on 15/11/15.
 */
public class MergeLinkList {
    int val;
    MergeLinkList next;
    MergeLinkList(int x) { val = x; }
    MergeLinkList withNextNodeOfValue(int value) {
        this.next = new MergeLinkList(value);
        return this.next;
    }

    @Override
    public String toString() {
        String nextString = "";
        if (next != null) {
            nextString = next.toString();
        }
        return  "-" + val + nextString;
    }

    public MergeLinkList sortList(MergeLinkList head) {
        if (head == null) {
            return null;
        }
        int size = getSize(head);
        return mergeSort(head, 0, size - 1);
    }

    private MergeLinkList mergeSort(MergeLinkList head, int start, int end) {
        if (start == end) {
            return head;
        }

        int mid = start + (end - start) / 2;
        MergeLinkList left = mergeSort(head, start, mid);
        MergeLinkList right = mergeSort(getNodeNoIndexOf(mid + 1, head), mid + 1, end);

        MergeLinkList newHead = null;
        int leftPointer = start;
        int rightPointer = mid + 1;
        while (leftPointer <= mid  || rightPointer <= end) {
            if (left == null) {
                newHead = largerOf(left, right);
                rightPointer++;
            } else if (right == null) {
                newHead = largerOf(left, right);
                leftPointer++;
            } else if (left.val > right.val) {

            }
        }

        return newHead;
    }

    private MergeLinkList largerOf(MergeLinkList left, MergeLinkList right) {
        if (left == null) {
            return right;
        } else if (right == null) {
            return left;
        } else {
            return left.val > right.val ? left : right;
        }
    }

    private int getSize(MergeLinkList head) {
        int size = 0;
        MergeLinkList next = head;
        while(next != null) {
            size++;
            next = next.next;
        }

        return size;
    }

    private MergeLinkList getNodeNoIndexOf(int index, MergeLinkList head) {
        MergeLinkList node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }

        return node;
    }

    public static void main(String[] args) {
        MergeLinkList listNode = new MergeLinkList(15);
        listNode.withNextNodeOfValue(6)
                .withNextNodeOfValue(12)
                .withNextNodeOfValue(3)
                .withNextNodeOfValue(90);

        System.out.println(listNode);
        System.out.println(listNode.sortList(listNode));
    }
}
