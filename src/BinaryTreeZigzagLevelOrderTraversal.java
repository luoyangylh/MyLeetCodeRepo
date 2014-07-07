// Binary Tree Zigzag Level Order Traversal 

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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
    	List<List<Integer>> res = new ArrayList<List<Integer>>();
    	if (root == null) return res;
    	levelOrder(root, 1, res);
    	for (int i = 0; i < res.size(); i++) {
    		if (i % 2 != 0) {
    			Collections.reverse(res.get(i));
    		}
    	}
        return res;
    }

    public void levelOrder(TreeNode root, int level, List<List<Integer>> res) {
    	if (root == null) return;

    	if (level > res.size()) {
    		res.add(new ArrayList<Integer>());
    	}
    	res.get(level-1).add(root.val);
    	levelOrder(root.left, level+1, res);
   		levelOrder(root.right, level+1, res);
    }
}