// Linked List Cycle II 

/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class LinkedListCycleII {
    public ListNode detectCycle(ListNode head) {
    	ListNode fast = head;
    	ListNode slow = head;
    	if (head == null || head.next == null) {
    		return null;
    	}

    	while (fast.next != null && fast.next.next != null) {
    		slow = slow.next;
    		fast = fast.next.next;
    		if (slow == fast) {
    			slow = head;
    			while (slow != fast) {
    				slow = slow.next;
    				fast = fast.next;
    			}
    			return slow;
    		}
    	}

		return null;        
    }
}


