/**
 * Created with IntelliJ IDEA.
 * User: longhuayou
 * Date: 5/27/14
 * Time: 8:31 PM
 * To change this template use File | Settings | File Templates.
 */
public class SwapNodesinPairs {
    //method 1 -- iteration
    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode fake = new ListNode(-1);
        fake.next = head;

        ListNode pre = fake;
        ListNode cur = head;

        while (cur != null && cur.next != null) {
            pre.next = cur.next;
            cur.next = cur.next.next;
            pre.next.next = cur;

            pre = cur;
            cur = cur.next;
        }

        return fake.next;
    }
    //method 2 -- recursive
    public ListNode swap(ListNode head) {
        if (head == null)
            return null;
        else if (head.next == null) {
            return head;
        } else {
            ListNode nextList = swapPairs(head.next.next);
            ListNode tmp = head.next;
            head.next = nextList;
            tmp.next = head;
            return tmp;
        }
    }

}
