package removeduplicatesfromsortedlist;

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
	public void test0() {
		n0.next = n1;
		n1.next = n2;
		assertEquals("[]", print(s.deleteDuplicates(n0)));
	}

	@Test
	public void test1() {
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		assertEquals("[]", print(s.deleteDuplicates(n1)));
	}

	@Test
	public void test2() {
		n2.next = n3;
		n3.next = n4;
		assertEquals("[1->]", print(s.deleteDuplicates(n2)));
	}

	@Test
	public void test3() {
		n2.next = n3;
		n3.next = n4;
		n4.next = n5;
		assertEquals("[1->3->]", print(s.deleteDuplicates(n2)));
	}

	@Test
	public void test4() {
		n0.next = n1;
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = n5;
		assertEquals("[3->]", print(s.deleteDuplicates(n0)));
	}
}
