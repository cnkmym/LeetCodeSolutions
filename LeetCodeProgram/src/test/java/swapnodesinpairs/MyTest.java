package swapnodesinpairs;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class MyTest {
	Solution s;
	ListNode n1;
	ListNode n2;
	ListNode n3;
	ListNode n4;
	ListNode n5;
	ListNode n6;
	ListNode n7;

	@Before
	public void init() {
		s = new Solution();
		n1 = new ListNode(1);
		n2 = new ListNode(2);
		n3 = new ListNode(3);
		n4 = new ListNode(4);
		n5 = new ListNode(5);
		n6 = new ListNode(6);
		n7 = new ListNode(7);
	}

	private String print(ListNode node) {
		StringBuilder sb = new StringBuilder();
		while (node != null) {
			sb.append(node.val);
			sb.append(",");
			node = node.next;
		}
		return sb.toString();
	}

	@Test
	public void test1() {
		assertEquals("", print(s.swapPairs(null)));
	}

	@Test
	public void test2() {
		assertEquals("1,", print(s.swapPairs(n1)));
	}

	@Test
	public void test3() {
		n1.next = n2;
		assertEquals("2,1,", print(s.swapPairs(n1)));
	}

	@Test
	public void test4() {
		n1.next = n2;
		n2.next = n3;
		assertEquals("2,1,3,", print(s.swapPairs(n1)));
	}

	@Test
	public void test5() {
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		assertEquals("2,1,4,3,", print(s.swapPairs(n1)));
	}
}
