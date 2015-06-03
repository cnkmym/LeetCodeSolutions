package removenodefromlist;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class MyTest {
	Solution s;
	ListNode n1 = new ListNode(0);
	ListNode n2 = new ListNode(1);
	ListNode n3 = new ListNode(2);
	ListNode n4 = new ListNode(3);
	ListNode n5 = new ListNode(4);
	ListNode n6 = new ListNode(5);
	ListNode n7 = new ListNode(6);
	// special
	ListNode n8 = new ListNode(7);
	ListNode n9 = null;

	@Before
	public void init() {
		s = new Solution();
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = n5;
		n5.next = n6;
		n6.next = n7;
	}

	private String traverse(ListNode l) {
		StringBuilder sb = new StringBuilder();
		ListNode header = l;
		while (header != null) {
			sb.append(header.val);
			sb.append(",");
			header = header.next;
		}
		return sb.toString();
	}

	@Test
	public void test1() {
		assertEquals("0,1,2,3,4,5,6,", traverse(n1));
	}

	@Test
	public void test2() {
		assertEquals("7,", traverse(n8));
	}

	@Test
	public void test3() {
		assertEquals("", traverse(n9));
	}

	@Test
	public void test4() {
		assertEquals("0,1,2,3,4,5,6,", traverse(s.removeNthFromEnd(n1, 0)));
	}

	@Test
	public void test5() {
		assertEquals("0,1,2,3,4,5,6,", traverse(s.removeNthFromEnd(n1, 0)));
	}

	@Test
	public void test6() {
		assertEquals("0,1,2,3,4,5,", traverse(s.removeNthFromEnd(n1, 1)));
	}

	@Test
	public void test7() {
		assertEquals("0,1,2,3,4,6,", traverse(s.removeNthFromEnd(n1, 2)));
	}

	@Test
	public void test8() {
		assertEquals("1,2,3,5,6,", traverse(s.removeNthFromEnd(n2, 3)));
	}

	@Test
	public void test9() {
		assertEquals("6,", traverse(s.removeNthFromEnd(n7, 3)));
	}
}
