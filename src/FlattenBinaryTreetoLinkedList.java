// Flatten Binary Tree to Linked List

/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public void flatten(TreeNode root) {
        //very similar to pre-order travesal
    	TreeNode res = new TreeNode(-1);
    	Stack<TreeNode> st = new Stack<TreeNode>();

    	if (root != null) {
    		st.push(root); 
    	}
    	while (!st.empty()) {
    		TreeNode node = st.pop();
    		res.right = node;
    		res.left = null;
    		res = res.right;
    		if (node.right != null) st.push(node.right);
    		if (node.left != null) st.push(node.left);
    		
    	}
        
    }
}