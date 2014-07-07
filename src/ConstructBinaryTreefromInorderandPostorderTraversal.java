// Construct Binary Tree from Inorder and Postorder Traversal 

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
    public TreeNode buildTree(int[] inorder, int[] postorder) {
    	int i_begin = 0;
    	int i_end = inorder.length - 1;
    	int p_begin = 0;
    	int p_end = postorder.length - 1;

    	return build(inorder, i_begin, i_end, postorder, p_begin, p_end);        
    }

    public TreeNode build(int[] inorder, int i_begin, int i_end,
    					  int[] postorder, int p_begin, int p_end) {
    	if (i_begin > i_end || p_begin > p_end) {
    		return null;
    	}

    	int rootVal = postorder[p_end];
    	TreeNode root = new TreeNode(rootVal);
    	//get the index of the root in inorder
    	int rootIndex=0;
        for(int i=0; i< inorder.length; i++){
            if(inorder[i]==rootVal){
                rootIndex = i;
                break;
            }
        }

    	root.left = build(inorder, i_begin, rootIndex-1, postorder, p_begin, p_begin + rootIndex - i_begin - 1);
    	root.right = build(inorder, rootIndex+1, i_end, postorder, p_begin + rootIndex - i_begin, p_end - 1);
    	return root;
    }
}





