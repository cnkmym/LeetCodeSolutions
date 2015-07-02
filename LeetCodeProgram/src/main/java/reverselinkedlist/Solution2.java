package reverselinkedlist;

import utility.ListNode;

public class Solution2 {
	public ListNode reverseBetween(ListNode head, int m, int n) {
		if (m == n) {
			return head;
		}
		int count = 0;
		ListNode newHead = null;
		ListNode newTail = null;
		ListNode first = head;
		ListNode previous = null;
		while (head != null) {
			count++;
			ListNode next = head.next;
			if (count < m) {
				previous = head;
			} else if (count == m) {
				newTail = head;
				newHead = head;
			} else if (m < count && count <= n) {
				ListNode tmp = head;
				tmp.next = newHead;
				newHead = tmp;
			}
			if (count == n) {
				newTail.next = next;
				break;
			}
			head = next;
		}

		if (previous != null) {
			previous.next = newHead;
		}

		return (m == 1) ? newHead : first;
	}
}
