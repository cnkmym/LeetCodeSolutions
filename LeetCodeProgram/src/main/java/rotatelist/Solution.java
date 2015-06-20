package rotatelist;

public class Solution {
	private int length;
	private ListNode previous;
	private ListNode current;
	private ListNode tail;

	public ListNode rotateRight(ListNode head, int k) {
		if (head == null || k <= 0) {
			return head;
		}

		current = head;
		length = 0;

		while (current != null) {
			length++;
			tail = current;
			current = current.next;
		}

		current = head;
		k = (length - k % length);
		if (k == 0 || k == length) {
			return head;
		}
		int index = 0;

		while (true) {
			previous = current;
			current = current.next;
			if (current == null) {
				// meet the tail
				current = head;
				index = -1;
			}
			index++;
			if (index == k) {
				return reorganize(current, tail, head, previous);
			}
		}

	}

	private ListNode reorganize(ListNode newHead, ListNode m, ListNode n, ListNode newTail) {
		if (m != null) {
			m.next = n;
		}
		if (newTail != null) {
			newTail.next = null;
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
