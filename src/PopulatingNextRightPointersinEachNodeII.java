// Populating Next Right Pointers in Each Node II 

/**
 * Definition for binary tree with next pointer.
 * public class TreeLinkNode {
 *     int val;
 *     TreeLinkNode left, right, next;
 *     TreeLinkNode(int x) { val = x; }
 * }
 */
public class PopulatingNextRightPointersinEachNodeII {
    public void connect(TreeLinkNode root) {
    	if (root == null) return;

    	if (root.left != null) {
    		if (root.right != null) {
    			root.left.next = root.right;
    		} else {
    			TreeLinkNode tmp = root.next;
    			while (tmp != null && tmp.left == null && tmp.right == null) {
    				tmp = tmp.next;
    			}
    			if (tmp != null) {
    				root.left.next = tmp.left != null ? tmp.left : tmp.right;
    			}
    		}
    	}

    	if (root.right != null) {
    		TreeLinkNode tmp = root.next;
    		while (tmp != null && tmp.left == null && tmp.right == null) {
    			tmp = tmp.next;
    		}
    		if (tmp != null) {
    			root.right.next = tmp.left != null ? tmp.left : tmp.right; 
    		}
    	}
    	//go right first to construct the new tree!
    	connect(root.right);
    	connect(root.left);

    }
}