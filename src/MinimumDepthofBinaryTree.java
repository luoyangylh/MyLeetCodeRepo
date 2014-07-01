// Minimum Depth of Binary Tree 

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
    public int minDepth(TreeNode root) {
    	boolean hasBrother = false;
    	return findDepth(root, hasBrother);        
    }

    public int findDepth(TreeNode root, boolean hasBrother) {
    	if (root == null)
    		return hasBrother ? Integer.MAX_VALUE : 0;

    	return 1 + Math.min(findDepth(root.left, root.right != null), 
    					findDepth(root.right, root.left != null));    	
    }
}