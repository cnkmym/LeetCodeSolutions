package removelinkedlistelement;

public class Solution {
	public ListNode removeElements(ListNode head, int val) {
		ListNode newHead = head;
		ListNode current = newHead;
		ListNode previous = null;
		while (current != null) {
			if (current.val == val) {
				current = current.next;
				if (previous == null) {
					// this is the first node
					newHead = current;
				} else {
					previous.next = null;
				}
			} else {
				if (previous != null) {
					previous.next = current;
				}
				previous = current;
				current = current.next;
			}
		}
		return newHead;
	}
}

class ListNode {
	public int val;
	public ListNode next;

	public ListNode(int x) {
		val = x;
	}
}
