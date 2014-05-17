/**
 * Created with IntelliJ IDEA.
 * User: longhuayou
 * Date: 5/16/14
 * Time: 10:25 PM
 * To change this template use File | Settings | File Templates.
 */

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
        next = null;
    }
}

public class RemoveDuplicatesfromSortedList {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode list = head;

        while (list != null && list.next != null) {
            if (list.val == list.next.val) {
                list.next = list.next.next;
            }
            else {
                list = list.next;
            }

        }

        return head;

    }
}
