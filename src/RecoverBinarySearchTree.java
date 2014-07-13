// Recover Binary Search Tree 

/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

//in-order traverse
public class Solution {
	TreeNode leftWrong, rightWrong, pre;
    public void recoverTree(TreeNode root) {
    	if (root == null) return;

    	getWrong(root);
    	int tmp = leftWrong.val;
    	leftWrong.val = rightWrong.val;
    	rightWrong.val = tmp;        
    }
    public void getWrong(TreeNode root) {
    	if (root == null) return;
    	//in-order traverse
    	getWrong(root.left);
    	if (pre != null && root.val < pre.val) {
    		//first find the wrong node
    		if (leftWrong == null) {
    			leftWrong = pre;
    			rightWrong = root;
    		} 
    		//second find the wrong node
    		else {
    			rightWrong = root;
    		}
    	}
    	pre = root;
    	getWrong(root.right);
    }
}