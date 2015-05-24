package mergetwosortedlist;

/**
 * Definition for singly-linked list. public class ListNode { int val; ListNode
 * next; ListNode(int x) { val = x; } }
 */
public class Solution {
	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		// naive solution
		// simple merge sort

		if (l1 == null || l2 == null) {
			return l1 != null ? l1 : l2;
		}
		ListNode head = new ListNode(0);
		ListNode ret = head;
		ListNode left = l1;
		ListNode right = l2;
		while (left != null && right != null) {
			if (left.val <= right.val) {
				ListNode newNode = left;
				ret.next = newNode;
				left = left.next;
			} else {
				ListNode newNode = right;
				ret.next = newNode;
				right = right.next;
			}
			ret = ret.next;
		}

		while (left != null) {
			ListNode newNode = left;
			ret.next = newNode;
			left = left.next;
			ret = ret.next;
		}

		while (right != null) {
			ListNode newNode = right;
			ret.next = newNode;
			right = right.next;
			ret = ret.next;
		}

		return head.next;
	}
}

class ListNode {
	public int val;
	public ListNode next;

	ListNode(int x) {
		val = x;
	}
}
