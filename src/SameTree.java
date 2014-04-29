/**
 * Created with IntelliJ IDEA.
 * User: longhuayou
 * Date: 4/27/14
 * Time: 10:45 AM
 * To change this template use File | Settings | File Templates.
 */


public class SameTree {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) return true;
        if (p == null || q == null) return false;

        if (p.val != q.val)
            return false;
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }
}
