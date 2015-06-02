package removelinkedlistelement;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class MyTest {
	Solution s;
	ListNode n1 = new ListNode(1);
	ListNode n2 = new ListNode(2);
	ListNode n3 = new ListNode(2);
	ListNode n4 = new ListNode(4);
	ListNode n5 = new ListNode(5);
	ListNode n6 = new ListNode(6);
	ListNode n7 = new ListNode(1);
	ListNode n8 = new ListNode(8);
	ListNode n9 = new ListNode(5);

	@Before
	public void init() {
		s = new Solution();
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = n5;
		n5.next = n6;
		n6.next = n7;
		n7.next = n8;
		n8.next = n9;
		n9.next = null;
	}

	private String print(ListNode head) {
		StringBuilder sb = new StringBuilder();
		while (head != null) {
			sb.append(head.val);
			sb.append(",");
			head = head.next;
		}
		return sb.toString();
	}

	@Test
	public void test1() {
		assertEquals("1,2,2,4,5,6,1,8,5,", print(s.removeElements(n1, 0)));
	}

	@Test
	public void test2() {
		assertEquals("2,2,4,5,6,8,5,", print(s.removeElements(n1, 1)));
	}

	@Test
	public void test3() {
		assertEquals("1,4,5,6,1,8,5,", print(s.removeElements(n1, 2)));
	}
	
	@Test
	public void test5() {
		assertEquals("1,2,2,4,6,1,8,", print(s.removeElements(n1, 5)));
	}
}
