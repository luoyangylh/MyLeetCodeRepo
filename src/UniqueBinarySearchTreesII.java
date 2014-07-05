// Unique Binary Search Trees II 

/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; left = null; right = null; }
 * }
 */

// use dfs instead of dp in I
public class Solution {
    public List<TreeNode> generateTrees(int n) {
    	return dfs(1, n);
    }

    public List<TreeNode> dfs(int begin, int end) {
    	List<TreeNode> res = new ArrayList<TreeNode>();
    	if (begin > end) {
    		res.add(null);
    		return res;
    	}

    	for (int i = begin; i <= end; i++) {
    		List<TreeNode> lefts = dfs(begin, i - 1);
    		List<TreeNode> rights = dfs(i + 1, end);
    		for (TreeNode left: lefts) {
    			for (TreeNode right: rights) {
    				TreeNode root = new TreeNode(i);
    				root.left = left;
    				root.right = right;
    				res.add(root);
    			}
    		}
    	}
    	return res;
    }
}


