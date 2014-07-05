// Convert Sorted List to Binary Search Tree 

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public TreeNode sortedListToBST(ListNode head) {
    	if (head == null) return null;

    	TreeNode res = new TreeNode(-1);
    	ListNode mid = findMid(head);
    	res.val = mid.val;
    	//if mid == head, means there left only one node or two
    	if (mid == head) {
    	    res.left = null;
    	} else {
        	res.left = sortedListToBST(head);
    	}
    	res.right = sortedListToBST(mid.next);
        return res;
    }
    //find the mid node to be the root
    public ListNode findMid(ListNode head) {
    	if (head == null) return null;
    	ListNode mid = head;
    	ListNode slow = head;
    	ListNode fast = head;
    	while (fast.next != null && fast.next.next != null) {
    		fast = fast.next.next;
    		if (fast.next == null || fast.next.next == null) {
    			mid = slow.next;
    			slow.next = null;
    			break;
    		} else {
    			slow = slow.next;
    		}
    	}
    	return mid;
    }
}