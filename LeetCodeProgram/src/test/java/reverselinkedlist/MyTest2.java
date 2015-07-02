package reverselinkedlist;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import utility.ListNode;

public class MyTest2 {
	Solution2 s;
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
		s = new Solution2();
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
		n2.next = n3;
		n3.next = n5;

		assertEquals("[1->2->3->]", print(s.reverseBetween(n2, 1, 1)));
		assertEquals("[1->2->3->]", print(s.reverseBetween(n2, 2, 2)));
		assertEquals("[1->2->3->]", print(s.reverseBetween(n2, 3, 3)));
	}

	@Test
	public void test2() {
		n2.next = n3;
		n3.next = n5;

		assertEquals("[2->1->3->]", print(s.reverseBetween(n2, 1, 2)));
	}

	@Test
	public void test3() {
		n2.next = n3;
		n3.next = n5;

		assertEquals("[3->2->1->]", print(s.reverseBetween(n2, 1, 3)));
	}

	@Test
	public void test4() {
		n2.next = n3;
		n3.next = n5;

		assertEquals("[1->3->2->]", print(s.reverseBetween(n2, 2, 3)));
	}

	@Test
	public void test5() {
		n2.next = n3;
		n3.next = n5;
		n5.next = n7;
		n7.next = n8;

		assertEquals("[1->2->3->4->5->]", print(s.reverseBetween(n2, 1, 1)));
	}

	@Test
	public void test6() {
		n2.next = n3;
		n3.next = n5;
		n5.next = n7;
		n7.next = n8;

		assertEquals("[1->4->3->2->5->]", print(s.reverseBetween(n2, 2, 4)));
	}

	@Test
	public void test7() {
		n2.next = n3;
		n3.next = n5;
		n5.next = n7;
		n7.next = n8;

		assertEquals("[1->2->4->3->5->]", print(s.reverseBetween(n2, 3, 4)));
	}

}
