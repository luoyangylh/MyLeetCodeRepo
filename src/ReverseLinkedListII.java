// Reverse Linked List II 

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
    public ListNode reverseBetween(ListNode head, int m, int n) {
    	ListNode p = new ListNode(-1);
    	ListNode q = new ListNode(-1);
    	p.next = head;
    	q = head;

    	for (int i = 1; i < m; i++) {
    		p = p.next;
    		q = q.next;
    	}
    	
    	for (int i = 0; i < n - m; i++) {
    	    ListNode temp = p.next;
    		p.next = q.next;
    		q.next = q.next.next;
    		p.next.next = temp;
    	}
        
        if (m == 1)
            return p.next;
        else
            return head;
    }
}