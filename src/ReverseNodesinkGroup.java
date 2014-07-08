// Reverse Nodes in k-Group

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
    public ListNode reverseKGroup(ListNode head, int k) {
    	if (head == null || k == 1) {
    		return head;
    	}

    	ListNode dummy = new ListNode(-1);
    	dummy.next = head;
    	ListNode pre = dummy;
    	ListNode next_one = head;

    	int count = 0;
    	while (next_one != null) {
    		count++;
    		if (count%k == 0) {
    			pre = rev(pre, next_one.next);
    			next_one = pre.next;
    		} else {
    			next_one = next_one.next;
    		}
    	}
        return dummy.next;
    }

    public ListNode rev(ListNode pre, ListNode next_one) {
    	ListNode last = pre.next;
    	ListNode curr = last.next;

    	while (curr != next_one) {
    		last.next = curr.next;
    		curr.next = pre.next;
    		pre.next = curr;

    		curr = last.next;
    	}
    	return last;
    }
}






