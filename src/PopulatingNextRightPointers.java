/**
 * Created with IntelliJ IDEA.
 * User: longhuayou
 * Date: 5/16/14
 * Time: 9:21 PM
 * To change this template use File | Settings | File Templates.
 */
class TreeLinkNode {

    int val;
    TreeLinkNode left, right, next;
    TreeLinkNode(int x) { val = x; }
}

public class PopulatingNextRightPointers {
    public void connect(TreeLinkNode root) {
        if (root == null) {
            return;
        }

        if (root.left != null) {
            root.left.next = root.right;
            connect(root.left);
        }

        if (root.right != null) {
            if (root.next == null) {
                root.right.next = null;
                connect(root.right);
            }
            else {
                root.right.next = root.next.left;
                connect(root.right);
            }
        }
    }
}
