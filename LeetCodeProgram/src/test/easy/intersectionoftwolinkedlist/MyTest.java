package intersectionoftwolinkedlist;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class MyTest {
	Solution s;
	ListNode p1 = new ListNode(1);
	ListNode p2 = new ListNode(2);
	ListNode p3 = new ListNode(3);
	ListNode p4 = new ListNode(3);
	ListNode p5 = new ListNode(3);
	ListNode p6 = new ListNode(3);
	ListNode p7 = new ListNode(3);
	ListNode q1 = new ListNode(1);
	ListNode q2 = new ListNode(2);
	ListNode q3 = new ListNode(3);
	ListNode q4 = new ListNode(3);
	ListNode q5 = new ListNode(3);
	ListNode q6 = new ListNode(3);
	ListNode q7 = new ListNode(3);

	@Before
	public void init() {
		s = new Solution();
	}

	@Test
	public void test1() {
		assertEquals(null, s.getIntersectionNode(null, null));
	}

	@Test
	public void test2() {
		p1.next = p2;
		p2.next = p3;
		p3.next = p4;
		q1.next = q2;
		assertEquals(null, s.getIntersectionNode(p1, q1));
	}

	@Test
	public void test3() {
		p1.next = p2;
		p2.next = p3;
		p3.next = p4;
		q1.next = p2;
		assertEquals(p2, s.getIntersectionNode(p1, q1));
	}

	@Test
	public void test4() {
		p1.next = p2;
		p2.next = p3;
		p3.next = p4;
		q1.next = q2;
		q2.next = q3;
		q3.next = p1;
		assertEquals(p1, s.getIntersectionNode(p1, q1));
	}
}
