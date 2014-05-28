/**
 * Created with IntelliJ IDEA.
 * User: longhuayou
 * Date: 5/26/14
 * Time: 4:13 PM
 * To change this template use File | Settings | File Templates.
 */
public class ConvertSortedArraytoBinarySearchTree {
    public TreeNode sortedArrayToBST(int[] num) {
        if (num.length == 0) {
            return null;
        }

        return sort(num, 0, num.length-1);

    }

    public TreeNode sort(int[] num, int start, int end) {
        if (start > end) {
            return null;
        }

        int mid = (start + end) / 2;

        TreeNode root = new TreeNode(num[mid]);
        root.left = sort(num, start, mid - 1);
        root.right = sort(num, mid + 1, end);

        return root;
    }
}

