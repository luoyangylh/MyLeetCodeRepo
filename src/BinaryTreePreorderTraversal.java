import java.util.ArrayList;
import java.util.Stack;

/**
 * Created with IntelliJ IDEA.
 * User: longhuayou
 * Date: 5/16/14
 * Time: 8:59 PM
 * To change this template use File | Settings | File Templates.
 */
public class BinaryTreePreorderTraversal {
    public ArrayList<Integer> preorderTraversal(TreeNode root) {
        ArrayList<Integer> res = new ArrayList<Integer>();

        if (root == null)
            return res;

        Stack<TreeNode> tree = new Stack<TreeNode>();


        tree.push(root);

        while (tree.size() != 0) {
            TreeNode node = tree.pop();
            res.add(node.val);
            if (node.right != null) {
                tree.push(node.right);
            }
            if (node.left != null) {
                tree.push(node.left);
            }

        }

        return res;
    }
}
