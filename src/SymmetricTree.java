/**
 * Created with IntelliJ IDEA.
 * User: longhuayou
 * Date: 5/31/14
 * Time: 1:50 PM
 * To change this template use File | Settings | File Templates.
 */

import java.util.Stack;

public class SymmetricTree {
    public boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return true;
        }

        return isSym(root.left, root.right);

    }

    public boolean isSym(TreeNode left, TreeNode right) {
        if (left == null && right == null) {
            return true;
        }
        else if (left == null || right == null) {
            return false;
        }

        if (left.val == right.val) {
            return isSym(left.left, right.right) && isSym(left.right, right.left);
        }
        else {
            return false;
        }
    }

    //iteration method
    public boolean isSymmetric2(TreeNode root) {
        if (root == null) {
            return true;
        }
        Stack<TreeNode> node = new Stack<TreeNode>();
        node.push(root.left);
        node.push(root.right);

        while (!node.empty()) {
            TreeNode left = node.pop();
            TreeNode right = node.pop();

            if (left == null && right == null) {
                continue;
            }
            else if (left == null || right == null) {
                return false;
            }
            else if (left.val != right.val) {
                return false;
            }
            else {
                node.push(left.left);
                node.push(right.right);
                node.push(left.right);
                node.push(right.left);
            }
        }

        return true;
    }
}
