package leetcode;

import java.util.*;

import static java.util.stream.Collectors.toList;

public class UndirectedGraphNode {
    int label;
    List<UndirectedGraphNode> neighbors;
    UndirectedGraphNode(int x) {
        label = x;
        neighbors = new ArrayList<UndirectedGraphNode>();
    }

    public static UndirectedGraphNode fromString(String s) {
        String[] nodes = s.split("#");
        if (nodes.length == 0 || nodes[0] == null || nodes[0].isEmpty()) {
            return null;
        }

        int rootVal = Integer.valueOf(nodes[0].split(",")[0]);
        Map<Integer, UndirectedGraphNode> map = new HashMap<>();
        for (String node : nodes) {
            String[] vals = node.split(",");
            UndirectedGraphNode nodeObj = getAndCreateIfNotExists(vals[0], map);
            for (int i = 1; i < vals.length; i++) {
                nodeObj.neighbors.add(getAndCreateIfNotExists(vals[i], map));
            }
        }
        return map.get(rootVal);
    }

    private static UndirectedGraphNode getAndCreateIfNotExists(String val, Map<Integer, UndirectedGraphNode> map) {
        Integer key = Integer.parseInt(String.valueOf(val));
        if (!map.containsKey(key)) {
            map.put(key, new UndirectedGraphNode(key));
        }
        return map.get(key);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) { return true; }
        if (o == null || getClass() != o.getClass()) { return false; }
        UndirectedGraphNode that = (UndirectedGraphNode) o;
        return Objects.equals(label, that.label) &&
                Objects.equals(neighbors.size(), that.neighbors.size()) &&
                Objects.equals(getNeighborsWithSelf(this, neighbors), getNeighborsWithSelf(that, neighbors));
    }

    private List<UndirectedGraphNode> getNeighborsWithSelf(UndirectedGraphNode undirectedGraphNode,
                                                           List<UndirectedGraphNode> list) {
        return
                list.stream().filter(undirectedGraphNode1 ->  undirectedGraphNode != undirectedGraphNode)
                        .collect(toList());
    }

    @Override
    public int hashCode() {
        return Objects.hash(label, neighbors);
    }

    @Override
    public String toString() {
        return "leetcode.UndirectedGraphNode{" +
                "label=" + label +
                ", neighbors=" + getNeighbourString() +
                '}';
    }

    private String getNeighbourString() {
        StringBuilder sb = new StringBuilder();
        for (UndirectedGraphNode neighbor : neighbors) {
            if (neighbor == this) {
                sb.append("leetcode.UndirectedGraphNode{label=" + neighbor.label+"}");
            } else {
                sb.append(neighbor.toString());
            }
        }
        return sb.toString();
    }
}
