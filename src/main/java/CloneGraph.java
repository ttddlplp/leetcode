public class CloneGraph {
    public UndirectedGraphNode cloneGraph(UndirectedGraphNode node) {
        if (node.neighbors.isEmpty()) {
            return new UndirectedGraphNode(node.label);
        } else {
            UndirectedGraphNode result = new UndirectedGraphNode(node.label);
            for (UndirectedGraphNode neighbor : node.neighbors) {
                result.neighbors.add(cloneGraph(neighbor));
            }
            return result;
        }
    }


}
