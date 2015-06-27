package removeduplicatesfromsortedlist;

import java.util.ArrayList;
import java.util.List;

import utility.ListNode;

public class Solution2 {
	private List<ListNode> nodes;

	public ListNode deleteDuplicates(ListNode head) {
		nodes = new ArrayList<ListNode>();
		if (head == null) {
			return null;
		}
		while (head != null) {
			int uselessValue = head.val + 1;
			while (head != null) {
				ListNode next = head.next;
				if (next != null && next.val == head.val) {
					uselessValue = head.val;
					head = next.next;
				} else {
					break;
				}
			}
			if (head != null && head.val == uselessValue) {
				head = head.next;
				continue;
			}
			if (head != null) {
				if (!nodes.isEmpty()) {
					nodes.get(nodes.size() - 1).next = head;
				}
				nodes.add(head);
				head = head.next;
			}
		}

		if (!nodes.isEmpty()) {
			nodes.get(nodes.size() - 1).next = null;
		}
		return (nodes.isEmpty()) ? null : nodes.get(0);
	}
}
