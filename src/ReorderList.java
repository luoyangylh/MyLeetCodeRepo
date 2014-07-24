// Reorder List

// Given a singly linked list L: L0→L1→…→Ln-1→Ln,
// reorder it to: L0→Ln→L1→Ln-1→L2→Ln-2→…

// You must do this in-place without altering the nodes' values.

// For example,
// Given {1,2,3,4}, reorder it to {1,4,2,3}.

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
public class Solution {
    public void reorderList(ListNode head) {
  		//把整个链表划分成2个等长的子链表，如果原链表长度为奇数，那么第一个子链表的长度多1。
		// 翻转第二个子链表；
		// 将两个子链表合并。
		if (head == null || head.next = null) {
			return head;
		}

    	ListNode mid = find(head);
    	ListNode last = reverse(mid);
    	merge(head, last);
		    
    }
    public ListNode reverse(ListNode head) {
			ListNode newHead = null;
			while (head != null) {
				ListNode nextHead = head.next;
				head.next = newHead;
				newHead = head;
				head = nextHead;
			}
			return newHead;
	}

	public ListNode findMid(ListNode head) {
		ListNode slow = head;
		ListNode fast = head;

		while (fast.next != null && fast.next.next != null) {
			fast = fast.next.next;
			slow = slow.next;
		}
		return slow.next;
	}

	public void merge(ListNode first, ListNode last) {
		ListNode markLast = last;
		ListNode dummy = new ListNode(-1);
		ListNode p = dummy;
		while (first != markLast) {
			p.next = first;
			p = p.next;
			p.next = last;
			p = p.next;

			first = first.next;
			// when list has odd nodes, first has one more node than last list
			last = last == null ? null : last.next;
		}
		return dummy.next;
	}
}