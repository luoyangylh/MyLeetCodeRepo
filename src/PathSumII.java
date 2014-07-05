// Path Sum II 

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
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
    	List<List<Integer>> res = new ArrayList<List<Integer>>();
    	if (root == null) 
    		return res;
    	getPath(root, sum, res, new ArrayList<Integer>());
        return res;
    }

    public void getPath(TreeNode root, int sum, List<List<Integer>> res, List<Integer> path) {
    	if (root == null) return;
    	
        path.add(root.val);
        sum -= root.val;
    	if (root.left == null && root.right == null && sum == 0) {
    		res.add(new ArrayList<Integer>(path));
    	} else {
    		getPath(root.left, sum, res, path);
    		getPath(root.right, sum, res, path);
    	}
    	path.remove(path.size() - 1);        
    	
    }
}