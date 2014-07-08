// Validate Binary Search Tree

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
    public boolean isValidBST(TreeNode root) {
        
        return isValid(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    public boolean isValid(TreeNode root, int lower, int upper) {
    	if (root == null) return true;

    	return root.val > lower && root.val < upper
    		&& isValid(root.left, lower, root.val)
    		&& isValid(root.right, root.val, upper);
    }
}