// Clone Graph 

/**
 * Definition for undirected graph.
 * class UndirectedGraphNode {
 *     int label;
 *     List<UndirectedGraphNode> neighbors;
 *     UndirectedGraphNode(int x) { label = x; neighbors = new ArrayList<UndirectedGraphNode>(); }
 * };
 */
// Can use both DFS and BFS to solve it
public class Solution {
    // Method 1 DFS
    public UndirectedGraphNode cloneGraph(UndirectedGraphNode node) {
    	if (node == null) return null;

        // UndirectedGraphNode res = new UndirectedGraphNode(node.label);
        HashMap<UndirectedGraphNode, UndirectedGraphNode> hm = new HashMap<UndirectedGraphNode, UndirectedGraphNode>();
        // hm.put(node, res);
        return clone(node, hm);
        
    }

    public UndirectedGraphNode clone(UndirectedGraphNode node, HashMap<UndirectedGraphNode, UndirectedGraphNode> hm) {
    	if (hm.containsKey(node)) {
            return hm.get(node);
        }
        UndirectedGraphNode cnode = new UndirectedGraphNode(node.label);
        hm.put(node, cnode);

    	for (UndirectedGraphNode n: node.neighbors) {
    		cnode.neighbors.add(clone(n, hm));
    	}
        return cnode;
    }

    // BFS is better
    public UndirectedGraphNode cloneGraph(UndirectedGraphNode node) {
        if (node == null) return null;
        HashMap<UndirectedGraphNode, UndirectedGraphNode> hm = new HashMap<UndirectedGraphNode, UndirectedGraphNode>();
        List<UndirectedGraphNode> list = new ArrayList<UndirectedGraphNode>();
        list.add(node);
        hm.put(node, new UndirectedGraphNode(node.label));

        int start = 0;

        while (start < list.size()) {
            UndirectedGraphNode head = list.get(start);
            start++;
            for (UndirectedGraphNode neighbor: head.neighbors) {
                if (!hm.containsKey(neighbor)) {
                    UndirectedGraphNode tmp = new UndirectedGraphNode(neighbor.label);
                    hm.put(neighbor, tmp);
                    list.add(neighbor);
                }
            }
        }

        for (int i = 0; i < list.size(); i++) {
            UndirectedGraphNode clone = hm.get(list.get(i));
            for (UndirectedGraphNode neighbor: list.get(i).neighbors) {
                clone.neighbors.add(hm.get(neighbor));
            }
        }
        return hm.get(node);
    }
}



