package minstack;

public class Solution {
	private ListNode currentMinNode;
	private ListNode currentHead;
	private ListNode currentTail;

	public void push(int x) {
		ListNode node = new ListNode(x);
		if (currentMinNode != null) {
			node.minValueNodeBeforeThisNode = currentMinNode;
			currentMinNode = (currentMinNode.val <= x) ? currentMinNode : node;
		}
		if (currentHead == null) {
			currentHead = node;
			currentMinNode = node;
		}
		if (currentTail != null) {
			node.previous = currentTail;
		}
		currentTail = node;
	}

	public void pop() {
		if (currentTail == null) {
			throw new IllegalArgumentException();
		}
		if (currentTail.equals(currentHead)) {
			currentTail = null;
			currentHead = null;
			currentMinNode = null;
		} else {
			currentMinNode = currentTail.minValueNodeBeforeThisNode;
			currentTail = currentTail.previous;
		}
	}

	public int top() {
		if (currentTail == null) {
			throw new IllegalArgumentException();
		}
		return currentTail.val;
	}

	public int getMin() {
		if (currentMinNode == null) {
			throw new IllegalArgumentException();
		}
		return currentMinNode.val;
	}
}

class ListNode {
	int val;
	ListNode previous;
	ListNode minValueNodeBeforeThisNode;

	public ListNode(int x) {
		this.val = x;
	}
}