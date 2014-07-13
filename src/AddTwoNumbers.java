// Add Two Numbers 

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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(-1);
        ListNode p = dummy;
        if (l1 == null && l2 == null)
        	return dummy;
        int carry = 0;
        while (l1 != null || l2 != null) {
        	int num1 = l1 == null ? 0 : l1.val;
        	int num2 = l2 == null ? 0 : l2.val;
        	int sum = num1 + num2 + carry;
        	carry = sum / 10;
        	dummy.next = new ListNode(sum % 10);
        	dummy = dummy.next;
        	l1 = l1 == null ? l1 : l1.next;
        	l2 = l2 == null ? l2 : l2.next;
        }
        if (carry > 0) {
        	dummy.next = new ListNode(carry);
        }
        return p.next;
    }
}