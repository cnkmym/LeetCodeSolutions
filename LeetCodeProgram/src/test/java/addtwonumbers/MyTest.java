package addtwonumbers;

import static org.junit.Assert.*;

import java.util.Stack;

import org.junit.Before;
import org.junit.Test;

public class MyTest {
	Solution s;

	@Before
	public void init() {
		s = new Solution();
	}

	private ListNode build(int[] values) {
		ListNode ret = null;
		ListNode head = null;
		for (int v : values) {
			if (ret == null) {
				ret = new ListNode(v);
				head = ret;
			} else {
				ret.next = new ListNode(v);
				ret = ret.next;
			}
		}
		return head;
	}

	private int merge(ListNode l) {
		Stack<Integer> s = new Stack<Integer>();
		while (l != null) {
			s.push(l.val);
			l = l.next;
		}
		int ret = 0;
		while (!s.isEmpty()) {
			ret = ret * 10 + s.pop();
		}
		return ret;
	}

	@Test
	public void test1() {
		ListNode l1 = build(new int[] { 1, 2, 3 });
		ListNode l2 = build(new int[] { 4, 5, 6 });
		assertEquals(975, merge(s.addTwoNumbers(l1, l2)));
	}

	@Test
	public void test2() {
		ListNode l1 = build(new int[] { 8, 1 });
		ListNode l2 = build(new int[] { 3, 9 });
		assertEquals(111, merge(s.addTwoNumbers(l1, l2)));
	}

	@Test
	public void test3() {
		ListNode l1 = build(new int[] { 8 });
		ListNode l2 = build(new int[] { 3, 9 });
		assertEquals(101, merge(s.addTwoNumbers(l1, l2)));
	}

	@Test
	public void test4() {
		ListNode l1 = build(new int[] { 8, 1 });
		ListNode l2 = build(new int[] { 9 });
		assertEquals(27, merge(s.addTwoNumbers(l1, l2)));
	}

	@Test
	public void test5() {
		ListNode l1 = build(new int[] { 8, 1 });
		ListNode l2 = build(new int[] {});
		assertEquals(18, merge(s.addTwoNumbers(l1, l2)));
	}
}
