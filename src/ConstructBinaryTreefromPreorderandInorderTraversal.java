// Construct Binary Tree from Preorder and Inorder Traversal 

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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
    	if (preorder == null || inorder == null) {
            return null;
        }
        
        int p_begin = 0;
    	int p_end = preorder.length - 1;
    	int i_begin = 0;
    	int i_end = inorder.length - 1;

    	return build(preorder, p_begin, p_end, inorder, i_begin, i_end);        
    }

    public TreeNode build(int[] preorder, int p_begin, int p_end, int[] inorder, int i_begin, int i_end) {
    	if (p_begin > p_end || i_begin > i_end) {
    		return null;
    	}
    	int rootVal = preorder[p_begin];
    	TreeNode root = new TreeNode(rootVal);
    	int rootIndex = 0;
    	for (int i = i_begin; i <= i_end; i++) {
    		if (inorder[i] == rootVal) {
    			rootIndex = i;
    			break;
    		}
    	}

    	root.left = build(preorder, p_begin+1, p_begin+1+rootIndex-i_begin-1, inorder, i_begin, rootIndex - 1);
    	root.right = build(preorder, p_begin+1+rootIndex-i_begin, p_end, inorder, rootIndex+1, i_end);
    	return root;
    }
}







