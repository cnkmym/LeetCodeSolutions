package reverselinkedlist;

public class Solution {
	// method 1, using stack
	/**
	 * 

	public ListNode reverseList(ListNode head) {
		if (head == null) {
			return null;
		}
		Stack<ListNode> stack = new Stack<ListNode>();
		while (head != null) {
			stack.push(head);
			ListNode pre = head;
			head = pre.next;
			pre.next = null;
		}
		ListNode newHead = null;
		ListNode current = null;
		while (!stack.isEmpty()) {
			ListNode newNode = stack.pop();
			if (newHead == null) {
				newHead = newNode;
			} else {
				current.next = newNode;
			}
			current = newNode;
		}
		return newHead;
	}
		 */

	// method2 : iterative
	public ListNode reverseList(ListNode head) {
		if (head == null) {
			return null;
		}
		ListNode previous = null;
		while (head != null) {
			ListNode next = head.next;
			if (previous == null) {
				previous = head;
				previous.next = null;
			} else {
				head.next = previous;
				previous = head;
			}
			head = next;
		}
		return previous;
	}
}

class ListNode {
	public int val;
	public ListNode next;

	public ListNode(int x) {
		val = x;
	}
}
