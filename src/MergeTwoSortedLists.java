/**
 * Created with IntelliJ IDEA.
 * User: longhuayou
 * Date: 5/17/14
 * Time: 8:55 PM
 * To change this template use File | Settings | File Templates.
 */
public class MergeTwoSortedLists {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode res = new ListNode(-1);
        ListNode node = res;

        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                node.next = l1;
                node = node.next;
                l1 = l1.next;
            }
            else {
                node.next = l2;
                node = node.next;
                l2 = l2.next;
            }
        }

        while (l1 != null) {
            node.next = l1;
            node = node.next;
            l1 = l1.next;
        }

        while (l2 != null) {
            node.next = l2;
            node = node.next;
            l2 = l2.next;
        }

        return res.next;

    }
}
