package partitionlist;

import utility.ListNode;

public class Solution {
	private ListNode smallHead = null;
	private ListNode smallTail = null;
	private ListNode bigHead = null;
	private ListNode bigTail = null;

	public ListNode partition(ListNode head, int x) {
		smallHead = null;
		smallTail = null;
		bigHead = null;
		bigTail = null;

		if (head == null) {
			return head;
		}
		while (head != null) {
			if (head.val < x) {
				addToSmall(head);
			} else {
				addToBig(head);
			}
			head = head.next;
		}

		if (smallTail == null) {
			bigTail.next = null;
			return bigHead;
		}

		if (bigHead == null) {
			smallTail.next = null;
			return smallHead;
		}

		smallTail.next = bigHead;
		bigTail.next = null;
		return smallHead;
	}

	private void addToSmall(ListNode node) {
		if (smallTail == null) {
			smallHead = node;
			smallTail = node;
		} else {
			smallTail.next = node;
			smallTail = node;
		}
	}

	private void addToBig(ListNode node) {
		if (bigTail == null) {
			bigHead = node;
			bigTail = node;
		} else {
			bigTail.next = node;
			bigTail = node;
		}
	}
}
