package removenodefromlist;

import java.util.HashMap;
import java.util.Map;

/**
 * Definition for singly-linked list. public class ListNode { int val; ListNode
 * next; ListNode(int x) { val = x; } }
 */
public class Solution {
	public ListNode removeNthFromEnd(ListNode head, int n) {
		// this is a very naive method
		// just spend space in memory for higher speed
		// first traverse all nodes, and save its index with itself
		// second, get previous one, get after one, and recombine the list
		if (head == null) {
			return head;
		}
		Map<Integer, ListNode> indexMap = new HashMap<Integer, ListNode>();
		ListNode temp = head;
		int index = 0;
		int length = 0;
		while (temp != null) {
			index++;
			length++;
			indexMap.put(index, temp);
			temp = temp.next;
		}
		int target = length + 1 - n;
		if (target <= 0 || target > length) {
			return head;
		}
		if (target == 1) {
			// no previous node
			return head.next;
		} else if (target == length) {
			indexMap.get(target - 1).next = null;
			return head;
		} else {
			indexMap.get(target - 1).next = indexMap.get(target + 1);
			return head;
		}
	}
}

class ListNode {
	public int val;
	public ListNode next;

	ListNode(int x) {
		val = x;
	}
}
