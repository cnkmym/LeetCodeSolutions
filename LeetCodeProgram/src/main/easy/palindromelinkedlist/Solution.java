package palindromelinkedlist;

import utility.ListNode;

public class Solution {
	ListNode rightHalfHead;

	public boolean isPalindrome(ListNode head) {
		int size = 0;
		ListNode tmp = head;
		while (tmp != null) {
			size++;
			tmp = tmp.next;
		}
		if (size <= 1) {
			return true;
		}
		ListNode leftHalfHead = head;
		if (size % 2 == 0) {
			// even size
			rightHalfHead = head.next;
			return compareNode(leftHalfHead, 1, size / 2);
		} else {
			// odd size
			rightHalfHead = head;
			return compareNode(leftHalfHead, 1, size / 2 + 1);
		}
	}

	private boolean compareNode(ListNode left, int currentPos, int leftSize) {
		boolean result = true;
		if (currentPos < leftSize) {
			rightHalfHead = rightHalfHead.next;
			ListNode nextLeft = left.next;
			result = compareNode(nextLeft, currentPos + 1, leftSize);
			if (!result) {
				return false;
			}
		}

		if (currentPos < leftSize) {
			rightHalfHead = rightHalfHead.next;
		}
		if (left.val == rightHalfHead.val) {
			return true;
		}
		return false;
	}
}
