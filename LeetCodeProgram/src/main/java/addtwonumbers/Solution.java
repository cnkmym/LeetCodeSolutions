package addtwonumbers;

public class Solution {
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		if (l1 == null && l2 == null) {
			return null;
		}

		int overflow = 0;
		ListNode current = null;
		ListNode ret = null;
		while (l1 != null || l2 != null || overflow > 0) {
			int v1 = (l1 != null) ? l1.val : 0;
			if (l1 != null) {
				l1 = l1.next;
			}
			int v2 = (l2 != null) ? l2.val : 0;
			if (l2 != null) {
				l2 = l2.next;
			}
			int newV = v1 + v2 + overflow;
			overflow = newV / 10;
			newV = newV % 10;
			ListNode n = new ListNode(newV);
			if (current == null) {
				current = n;
				ret = n;
			} else {
				current.next = n;
				current = n;
			}
		}

		return ret;
	}
}

class ListNode {
	public int val;
	public ListNode next;

	public ListNode(int x) {
		val = x;
	}
}