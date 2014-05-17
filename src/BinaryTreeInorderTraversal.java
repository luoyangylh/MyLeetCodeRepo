import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 * User: longhuayou
 * Date: 5/16/14
 * Time: 8:07 PM
 * To change this template use File | Settings | File Templates.
 */
public class BinaryTreeInorderTraversal {
    public ArrayList<Integer> inorderTraversal(TreeNode root) {
        ArrayList<Integer> res = new ArrayList<Integer>();

        if (root == null) {
            return res;
        }
        Stack<TreeNode> stack = new Stack<TreeNode>();
        TreeNode t = root;

        while (!stack.empty() || t != null) {
            if (t != null) {
                stack.push(t);
                t = t.left;
            } else {
                TreeNode node = stack.pop();
                res.add(node.val);
                t = node.right;
            }


        }

        return res;

    }
}
