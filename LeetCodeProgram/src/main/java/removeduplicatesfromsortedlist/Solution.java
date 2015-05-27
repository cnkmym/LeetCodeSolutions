package removeduplicatesfromsortedlist;

import java.util.HashSet;
import java.util.Set;

/**
 * Definition for singly-linked list. public class ListNode { int val; ListNode
 * next; ListNode(int x) { val = x; } }
 */
public class Solution {
	Set<Integer> values;

	public ListNode deleteDuplicates(ListNode head) {
		// naive solution
		// use just a set to check if current value has met already
		values = new HashSet<Integer>();
		ListNode previous = null;
		ListNode current = head;
		while (current != null) {
			if (values.contains(current.val)) {
				// current node should be removed
			} else {
				values.add(current.val);
				// pay much attention to pointer shift
				if (previous != null) {
					previous.next = current;
				}
				previous = current;
			}
			current = current.next;
		}
		//pay attention to close the list when using pointer shift strategy
		if (previous != null) {
			previous.next = null;
		}
		return head;
	}
}

class ListNode {
	public int val;
	public ListNode next;

	public ListNode(int x) {
		val = x;
	}
}
