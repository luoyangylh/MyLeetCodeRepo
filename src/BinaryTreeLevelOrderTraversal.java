// Binary Tree Level Order Traversal 

/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

public class BinaryTreeLevelOrderTraversal {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();

        if (root == null) return res;
        oneLevel(root, 1, res);
        // Collections.reverse(res);

        return res;
    }

    public void oneLevel(TreeNode root, int level, List<List<Integer>> res) {
    	if (res.size() < level) {
    		res.add(new ArrayList<Integer>());
    	}

    	res.get(level - 1).add(root.val);
    	if (root.left != null) oneLevel(root.left, level + 1, res);
    	if (root.right != null) oneLevel(root.right, level + 1, res);

    }
}


