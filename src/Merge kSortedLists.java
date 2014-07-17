// Merge k Sorted Lists 

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
    public ListNode mergeKLists(List<ListNode> lists) {
    	
    	ListNode cur = new ListNode(-1);
    	ListNode dummy = cur;

    	while (!lists.isEmpty()) {
    		int min = Integer.MAX_VALUE;
    		for (ListNode n: lists) {
    			if (n != null && n.val < min) {
    				min = n.val;
    				cur.next = n;
    			}    			
    		}
    		
    		cur = cur.next;
    	}

        return dummy.next;
    }
}

