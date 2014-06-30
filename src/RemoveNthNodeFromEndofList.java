// Remove Nth Node From End of List 

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

public class RemoveNthNodeFromEndofList {
    public ListNode removeNthFromEnd(ListNode head, int n) {
    	ListNode res = new ListNode(-1);
    	res.next = head;
    	ListNode first = res;
    	ListNode second = res;
    	for (int i = 0; i < n; i++) {
    		first = first.next;
    	}

    	while (first.next != null) {
    		first = first.next;
    		second = second.next;
    	}

    	second.next = second.next.next;
        return res.next;
    }
}