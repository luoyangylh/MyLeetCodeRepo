// Rotate List 

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode rotateRight(ListNode head, int n) {
    	if (head == null || n == 0) return head;
    	
        ListNode pre = new ListNode(-1);
        pre.next = head;
        ListNode p = head;
        ListNode q = head;

        for (int i = 0; i < n; i++) {
        	p = p.next;
        }
        if (p == null) return head;

        while (p != null && p.next != null) {
        	p = p.next;
        	q = q.next;
        }

        p.next = pre.next;
        pre.next = q.next;
        q.next = null;

        return pre.next;
    }
}