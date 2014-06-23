/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class BinaryTreePostorderTraversal {
    public List<Integer> postorderTraversal(TreeNode root) {
    	List<Integer> res = new ArrayList<Integer>();
    	Stack<TreeNode> tree = new Stack<TreeNode>();

    	if (root == null) return res;
    	tree.push(root);

    	while (!tree.empty() || root != null) {
    		while (root.left != null) {
    			tree.push(root.left);
    			root = root.left;
    		}

            TreeNode past = null;

    		while(!tree.empty()) {
    			TreeNode p = tree.pop();
    			if (p.right == past) {
    				res.add(p.val);
    				past = p;
    			} else {
    				tree.push(p);
    				tree.push(p.right);
    				root = p.right;
    				break;
    			}
    		}
    	}
    	return res;
    }
}