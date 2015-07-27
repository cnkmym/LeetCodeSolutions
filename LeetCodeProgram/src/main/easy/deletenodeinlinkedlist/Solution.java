package deletenodeinlinkedlist;

import utility.ListNode;

public class Solution {
	public void deleteNode(ListNode node) {
		if (node == null) {
			return;
		}
		ListNode current = node;
		ListNode previous = null;
		ListNode next = current.next;
		while (next != null) {
			current.val = next.val;
			previous = current;
			current = next;
			next = current.next;
		}
		previous.next = null;
	}
}
