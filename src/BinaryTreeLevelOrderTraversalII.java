import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: longhuayou
 * Date: 6/16/14
 * Time: 10:08 PM
 * To change this template use File | Settings | File Templates.
 */
public class BinaryTreeLevelOrderTraversalII {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();

        if (root == null) return res;
        oneLevel(root, 1, res);
        Collections.reverse(res);

        return res;

    }

    public void oneLevel(TreeNode root, int level, List<List<Integer>> res) {
        if (root == null) return;
        if (level > res.size()) {
            res.add(new ArrayList<Integer>());
        }

        oneLevel(root.left, level+1, res);
        oneLevel(root.right, level+1, res);

        res.get(level-1).add(root.val);

    }
}
