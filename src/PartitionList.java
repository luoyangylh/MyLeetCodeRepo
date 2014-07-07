// Partition List

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
    public ListNode partition(ListNode head, int x) {
    	ListNode large = new ListNode(1);
    	ListNode small = new ListNode(-1);
    	ListNode p = large;
    	ListNode res = small;

    	while (head != null) {
    		if (head.val < x) {
    			small.next = head;
    			small = small.next;
    			head = head.next;
    		} else {
    			large.next = head;
    			large = large.next;
    			head = head.next;
    		}
    	}
    	small.next = p.next;
    	large.next = null;
    	return res.next;   
    }
}