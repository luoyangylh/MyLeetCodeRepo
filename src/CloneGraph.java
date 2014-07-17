// Clone Graph 

/**
 * Definition for undirected graph.
 * class UndirectedGraphNode {
 *     int label;
 *     List<UndirectedGraphNode> neighbors;
 *     UndirectedGraphNode(int x) { label = x; neighbors = new ArrayList<UndirectedGraphNode>(); }
 * };
 */
public class Solution {
    public UndirectedGraphNode cloneGraph(UndirectedGraphNode node) {
    	if (node == null) return null;

        UndirectedGraphNode res = new UndirectedGraphNode(node.label);
        HashMap<UndirectedGraphNode, UndirectedGraphNode> hm = new HashMap<UndirectedGraphNode, UndirectedGraphNode>();
        hm.put(node, res);
        clone(node, res, hm);
        return res;
    }

    public void clone(UndirectedGraphNode node, UndirectedGraphNode res, HashMap<UndirectedGraphNode, UndirectedGraphNode> hm) {
    	if (node == null) return;

    	for (UndirectedGraphNode n: node.neighbors) {
    		UndirectedGraphNode tmp = new UndirectedGraphNode(n.label);
    		res.neighbors.add(tmp);
    		if (!hm.containsKey(n)) {
    			hm.put(n, tmp);
    		}    		
    	}

    	for (UndirectedGraphNode n: node.neighbors) {
    		UndirectedGraphNode cloneNode = hm.get(n);
    		clone(n, cloneNode);
    	}
    }
}



