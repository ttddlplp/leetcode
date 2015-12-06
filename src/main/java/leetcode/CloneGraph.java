package leetcode;

import java.util.HashMap;
import java.util.Map;

public class CloneGraph {
    public UndirectedGraphNode cloneGraph(UndirectedGraphNode node) {
        Map<Integer, UndirectedGraphNode> visited = new HashMap<>();
        return clone(visited, node);
    }

    private UndirectedGraphNode clone(Map<Integer, UndirectedGraphNode> visited, UndirectedGraphNode node) {
        if (node == null) {
            return null;
        }

        if (visited.containsKey(node.label)) {
            return visited.get(node.label);
        }

        UndirectedGraphNode result;
        if (node.neighbors.isEmpty()) {
            result = new UndirectedGraphNode(node.label);
        } else {
            result = new UndirectedGraphNode(node.label);
            for (UndirectedGraphNode neighbor : node.neighbors) {
                if (neighbor.label == node.label) {
                    result.neighbors.add(result);
                } else {
                    result.neighbors.add(clone(visited, neighbor));
                }
            }
        }
        visited.put(node.label, result);
        return result;
    }
}
