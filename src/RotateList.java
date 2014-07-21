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
    	ListNode p = head;
        
        int len = 1;
        while (p.next != null) {
            p = p.next;
            len++;
        }

        p.next = head;
        int k = n % len;

        for (int i = 0; i < len - k; i++) {
            p = p.next;
        }
        ListNode res = p.next;
        p.next = null;

        return res;
    
    }
}