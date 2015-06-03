package removeduplicatesfromsortedlist;

import java.util.HashSet;
import java.util.Set;

/**
 * Definition for singly-linked list. public class ListNode { int val; ListNode
 * next; ListNode(int x) { val = x; } }
 */
public class Solution {
	public ListNode deleteDuplicates(ListNode head) {
		// naive solution
		// use just a set to check if current value has met already
		// actually you do not need a set, since the list is sorted
		ListNode previous = null;
		ListNode current = head;
		while (current != null) {
			if (previous != null) {
				if (current.val != previous.val) {
					previous.next = current;
					previous = current;
				}
			}else{
				previous = current;
			}
			current = current.next;
		}
		// pay attention to close the list when using pointer shift strategy
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
