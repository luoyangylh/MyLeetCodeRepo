// Copy List with Random Pointer

/**
 * Definition for singly-linked list with a random pointer.
 * class RandomListNode {
 *     int label;
 *     RandomListNode next, random;
 *     RandomListNode(int x) { this.label = x; }
 * };
 */
//deep copy

public class Solution {
    public RandomListNode copyRandomList(RandomListNode head) {
    	if (head == null) return null;

    	HashMap<RandomListNode, RandomListNode> hm = new HashMap<RandomListNode, RandomListNode>();
    	RandomListNode newHead = new RandomListNode(head.label);
    	hm.put(head, newHead);

    	RandomListNode p = head;
    	RandomListNode q = newHead;

    	p = p.next;
    	while (p != null) {
    		RandomListNode tmp = new RandomListNode(p.label);
    		hm.put(p, tmp);
    		q.next = tmp;
    		q = q.next;
    		p = p.next;
    	}

    	p = head;
    	q = newHead;

    	while (p != null) {
    		if (p.random != null) {
    			q.random = hm.get(p.random);
    		} else {
    			q.random = null;
    		}
    		p = p.next;
    		q = q.next;
    	}

        return newHead;
    }
}