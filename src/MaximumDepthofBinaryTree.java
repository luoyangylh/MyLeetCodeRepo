/**
 * Created with IntelliJ IDEA.
 * User: longhuayou
 * Date: 4/27/14
 * Time: 10:43 AM
 * To change this template use File | Settings | File Templates.
 */

class TreeNode {

    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }

}

public class MaximumDepthofBinaryTree {
    public int maxDepth(TreeNode root) {
        if (root == null)
            return 0;
        return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
    }
}
