import java.util.ArrayList;
import java.util.Stack;

/**
 * Created with IntelliJ IDEA.
 * User: longhuayou
 * Date: 5/16/14
 * Time: 8:07 PM
 * To change this template use File | Settings | File Templates.
 */
public class BinaryTreeInorderTraversal {
    public ArrayList<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<Integer>();
        Stack<TreeNode> tree = new Stack<TreeNode>();

        if (root == null) return res;
        tree.push(root);

        while (!tree.empty()) {
            while (root.left != null) {
                tree.push(root.left);
                root = root.left;
            }

            TreeNode past = null;

            while(!tree.empty()) {
                TreeNode p = tree.pop();
                if (p.right == past || p.right == null) {
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
