package deletenodeinlinkedlist;

import static org.junit.Assert.*;

import java.util.LinkedList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import utility.ListNode;

public class MyTest {
	Solution s;
	ListNode l1;
	ListNode l2;
	ListNode l3;
	ListNode l4;

	@Before
	public void init() {
		s = new Solution();
		l1 = new ListNode(1);
		l2 = new ListNode(2);
		l3 = new ListNode(3);
		l4 = new ListNode(4);
		l1.next = l2;
		l2.next = l3;
		l3.next = l4;
	}

	private String print(ListNode head) {
		List<String> data = new LinkedList<String>();
		while (head != null) {
			data.add(String.valueOf(head.val));
			head = head.next;
		}
		return "[" + String.join(",", data) + "]";
	}

	@Test
	public void test1() {
		s.deleteNode(l1);
		assertEquals("[2,3,4]", print(l1));
	}

	@Test
	public void test2() {
		s.deleteNode(l2);
		assertEquals("[1,3,4]", print(l1));
	}

	@Test
	public void test3() {
		s.deleteNode(l3);
		assertEquals("[1,2,4]", print(l1));
	}
}
