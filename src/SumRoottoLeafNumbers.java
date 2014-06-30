// Sum Root to Leaf Numbers

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
    public int sumNumbers(TreeNode root) {
        int sum = 0;
        return getSum(root, sum);
    }

    public int getSum(TreeNode root, int sum) {
    	if (root == null) return 0;

    	if (root.left == null && root.right == null) {
    		return sum * 10 + root.val;
    	}

    	return getSum(root.left, sum * 10 + root.val)
    		+ getSum(root.right, sum * 10 + root.val);
    }
}