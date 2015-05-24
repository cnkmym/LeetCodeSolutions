package mergetwosortedlist;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class MyTest {
	Solution s;
	// first list
	ListNode n1 = new ListNode(0);
	ListNode n2 = new ListNode(1);
	ListNode n3 = new ListNode(2);
	ListNode n4 = new ListNode(3);
	ListNode n5 = new ListNode(4);
	ListNode n6 = new ListNode(5);
	ListNode n7 = new ListNode(6);
	// second list
	ListNode n8 = new ListNode(7);
	ListNode n9 = new ListNode(8);
	// third list
	ListNode n10 = new ListNode(10);

	@Before
	public void init() {
		s = new Solution();
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = n5;
		n5.next = n6;
		n6.next = n7;

		n8.next = n9;
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
	public void test0() {
		assertEquals("7,8,", traverse(s.mergeTwoLists(null, n8)));
	}

	@Test
	public void test1() {
		assertEquals("0,1,2,3,4,5,6,7,8,", traverse(s.mergeTwoLists(n1, n8)));
	}

	@Test
	public void test2() {
		assertEquals("7,8,10,", traverse(s.mergeTwoLists(n10, n8)));
	}

	@Test
	public void test3() {
		assertEquals("0,1,2,3,4,5,6,10,", traverse(s.mergeTwoLists(n10, n1)));
	}
}
