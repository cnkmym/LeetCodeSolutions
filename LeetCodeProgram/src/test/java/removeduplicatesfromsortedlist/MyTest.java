package removeduplicatesfromsortedlist;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class MyTest {
	Solution s;
	ListNode data;
	ListNode c1;
	ListNode c2;
	ListNode c3;
	ListNode c4;
	ListNode c5;

	@Before
	public void init() {
		s = new Solution();
		data = new ListNode(1);
		c1 = new ListNode(2);
		data.next = c1;
		c2 = new ListNode(2);
		c1.next = c2;
		c3 = new ListNode(4);
		c2.next = c3;
		c4 = new ListNode(5);
		c3.next = c4;
		c5 = new ListNode(5);
		c4.next = c5;
	}

	private String print(ListNode head) {
		StringBuilder sb = new StringBuilder();
		while (head != null) {
			sb.append(head.val);
			sb.append("->");
			head = head.next;
		}
		return sb.toString();
	}

	@Test
	public void test1() {
		assertEquals("", print(s.deleteDuplicates(null)));
	}

	@Test
	public void test2() {
		assertEquals("1->2->4->5->", print(s.deleteDuplicates(data)));
	}

	@Test
	public void test3() {
		assertEquals("2->4->5->", print(s.deleteDuplicates(c2)));
	}
}
