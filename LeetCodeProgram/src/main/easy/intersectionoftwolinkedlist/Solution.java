package intersectionoftwolinkedlist;

/**
 * Definition for singly-linked list. public class ListNode { int val; ListNode
 * next; ListNode(int x) { val = x; next = null; } }
 */
public class Solution {
	public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
		int lengthA = length(headA);
		int lengthB = length(headB);
		// regulate list size
		while (lengthA > lengthB) {
			headA = headA.next;
			lengthA--;
		}
		// regulate list size
		while (lengthB > lengthA) {
			headB = headB.next;
			lengthB--;
		}
		while (headA != null) {
			if (headA.equals(headB)) {
				// find intersection start point
				return headA;
			}
			headA = headA.next;
			headB = headB.next;
		}
		// no intersection
		return null;
	}

	private int length(ListNode head) {
		int length = 0;
		ListNode x = head;
		while (x != null) {
			x = x.next;
			length++;
		}
		return length;
	}
}

class ListNode {
	public int val;
	public ListNode next;

	public ListNode(int x) {
		val = x;
		next = null;
	}
}
