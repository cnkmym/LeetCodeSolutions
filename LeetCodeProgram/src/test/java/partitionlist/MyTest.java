package partitionlist;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import utility.ListNode;

public class MyTest {
	Solution s;

	ListNode n0 = new ListNode(1);
	ListNode n1 = new ListNode(1);
	ListNode n2 = new ListNode(1);
	ListNode n3 = new ListNode(2);
	ListNode n4 = new ListNode(2);
	ListNode n5 = new ListNode(3);
	ListNode n6 = new ListNode(3);
	ListNode n7 = new ListNode(4);
	ListNode n8 = new ListNode(5);
	ListNode n9 = new ListNode(6);
	ListNode n10 = new ListNode(7);

	@Before
	public void init() {
		s = new Solution();

		n0 = new ListNode(1);
		n1 = new ListNode(1);
		n2 = new ListNode(1);
		n3 = new ListNode(2);
		n4 = new ListNode(2);
		n5 = new ListNode(3);
		n6 = new ListNode(3);
		n7 = new ListNode(4);
		n8 = new ListNode(5);
		n9 = new ListNode(6);
		n10 = new ListNode(7);
	}

	private String print(ListNode head) {
		StringBuilder sb = new StringBuilder();
		sb.append("[");
		while (head != null) {
			sb.append(head.val + "->");
			head = head.next;
		}
		sb.append("]");
		return sb.toString();
	}

	@Test
	public void test1() {
		n10.next = n9;
		n9.next = n8;
		n8.next = n7;
		assertEquals("[7->6->5->4->]", print(n10));
		assertEquals("[6->5->4->7->]", print(s.partition(n10, 7)));
	}

	@Test
	public void test2() {
		n10.next = n9;
		n9.next = n8;
		n8.next = n7;
		assertEquals("[7->6->5->4->]", print(n10));
		assertEquals("[4->7->6->5->]", print(s.partition(n10, 5)));
	}

	@Test
	public void test3() {
		assertEquals("[7->]", print(n10));
		assertEquals("[7->]", print(s.partition(n10, 1)));
		assertEquals("[7->]", print(s.partition(n10, 10)));
	}

	@Test
	public void test4() {
		n0.next = n1;
		n1.next = n2;
		n2.next = n3;
		assertEquals("[1->1->1->2->]", print(n0));
		assertEquals("[1->1->1->2->]", print(s.partition(n0, 1)));
		assertEquals("[1->1->1->2->]", print(s.partition(n0, 2)));
	}
}
