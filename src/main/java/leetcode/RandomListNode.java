package leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Created by gaoxiangzeng-personal on 15/12/10.
 */
public class RandomListNode{
    public int label;

    RandomListNode(int x) {
        label = x;
    }

    public RandomListNode random;
    public RandomListNode next;

    public static class Builder {
        RandomListNode listNode;
        RandomListNode currentNode;
        Map<Integer, RandomListNode> nodeMap = new HashMap<>();
        public Builder(int val, Integer random) {
            listNode = createOrGetFromMap(val);
            listNode.random = createOrGetFromMap(random);
            currentNode = listNode;
        }

        private RandomListNode createOrGetFromMap(Integer val) {
            if (val == null) {
                return null;
            }
            if (nodeMap.containsKey(val)) {
                return nodeMap.get(val);
            } else {
                RandomListNode newNode = new RandomListNode(val);
                nodeMap.put(val, newNode);
                return newNode;
            }
        }

        public Builder with(int val, Integer random) {
            currentNode.next = createOrGetFromMap(val);
            currentNode.random = createOrGetFromMap(random);
            currentNode = currentNode.next;
            return this;
        }

        public RandomListNode build() {
            return listNode;
        }
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this)
                .add("label", label)
                .add("random", random == null ? "null" : random.label)
                .add("next", next)
                .toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RandomListNode that = (RandomListNode) o;
        return Objects.equals(label, that.label) &&
                Objects.equals(random, that.random) &&
                Objects.equals(next, that.next);
    }

    @Override
    public int hashCode() {
        return Objects.hash(label);
    }
}
