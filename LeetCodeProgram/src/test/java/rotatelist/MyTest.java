package rotatelist;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class MyTest {
	Solution s;
	ListNode l1 = new ListNode(1);
	ListNode l2 = new ListNode(2);
	ListNode l3 = new ListNode(3);
	ListNode l4 = new ListNode(4);
	ListNode l5 = new ListNode(5);
	ListNode l6 = new ListNode(6);
	ListNode l7 = new ListNode(7);
	ListNode l8 = new ListNode(8);

	@Before
	public void init() {
		s = new Solution();
		l1.next = l2;
		l2.next = l3;
		l3.next = l4;
		l4.next = l5;
		l5.next = l6;
		l6.next = l7;
		l7.next = l8;
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
	public void test0() {
		l1.next = null;
		assertEquals("1,", print(s.rotateRight(l1, 1)));
		assertEquals("1,", print(s.rotateRight(l1, 1000000)));
	}

	@Test
	public void test1() {
		assertEquals("1,2,3,4,5,6,7,8,", print(s.rotateRight(l1, 0)));
	}

	@Test
	public void test2() {
		assertEquals("8,1,2,3,4,5,6,7,", print(s.rotateRight(l1, 1)));
	}

	@Test
	public void test3() {
		assertEquals("7,8,1,2,3,4,5,6,", print(s.rotateRight(l1, 2)));
	}

	@Test
	public void test4() {
		assertEquals("6,7,8,1,2,3,4,5,", print(s.rotateRight(l1, 3)));
	}

	@Test
	public void test6() {
		assertEquals("8,1,2,3,4,5,6,7,", print(s.rotateRight(l1, 80001)));
	}
}
