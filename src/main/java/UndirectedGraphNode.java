import java.util.*;

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

        int rootVal = Integer.valueOf(nodes[0].substring(0, 1));
        Map<Integer, UndirectedGraphNode> map = new HashMap<>();
        for (String node : nodes) {
            char[] vals = node.toCharArray();
            UndirectedGraphNode nodeObj = new UndirectedGraphNode(Integer.valueOf(vals[0]));
            for (int i = 0; i < vals.length; i++) {

            }
        }
        

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) { return true; }
        if (o == null || getClass() != o.getClass()) { return false; }
        UndirectedGraphNode that = (UndirectedGraphNode) o;
        return Objects.equals(label, that.label) &&
                Objects.equals(neighbors, that.neighbors);
    }

    @Override
    public int hashCode() {
        return Objects.hash(label, neighbors);
    }
}
