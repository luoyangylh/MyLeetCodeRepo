// Remove Duplicates from Sorted List II

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
    public ListNode deleteDuplicates(ListNode head) {
    	if (head == null) return null;

    	ListNode dummy = new ListNode(-1);
    	ListNode res = dummy;
    	dummy.next = head;
    	int dul = head.val;
    	while (dummy.next != null && dummy.next.next != null) {
    		if (dummy.next.val == dummy.next.next.val) {
    			dul = dummy.next.val;
    			dummy.next = dummy.next.next.next;
    		} else if (dummy.next != head && dummy.next.val == dul) {
    			dummy.next = dummy.next.next;
    		} else {
    			dummy = dummy.next;
    		}
    	}
    	
    	if (dummy.next != null) {
    	    if (dummy.next.val == dul && dummy.next != head) {
    	        dummy.next = dummy.next.next;
    	    }
    	}
    	return res.next;       
    }
}

