package swapnodesinpairs;

public class Solution {
	public ListNode swapPairs(ListNode head) {
		ListNode first = head;
		ListNode current = first;
		ListNode previous = null;
		while (current != null) {
			current = swap(previous, current);
			// pay attention to first node issue
			if (previous == null) {
				first = current;
			}
			current = current.next;
			if (current == null) {
				break;
			} else {
				previous = current;
				current = current.next;
			}
		}
		return first;
	}

	private ListNode swap(ListNode parent, ListNode node) {
		ListNode next = node.next;
		if (next == null) {
			return node;
		}
		if (parent == null) {
			ListNode child = next.next;
			next.next = node;
			node.next = child;
			return next;
		} else {
			ListNode child = next.next;
			next.next = node;
			node.next = child;
			parent.next = next;
			return next;
		}
	}
}

class ListNode {
	public int val;
	public ListNode next;

	public ListNode(int x) {
		val = x;
	}
}
