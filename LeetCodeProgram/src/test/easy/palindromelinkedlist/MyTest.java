package palindromelinkedlist;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import utility.ListNode;

public class MyTest {
	Solution s;
	ListNode n1 = new ListNode(1);
	ListNode m1 = new ListNode(1);
	ListNode n2 = new ListNode(2);
	ListNode m2 = new ListNode(2);
	ListNode n3 = new ListNode(3);
	ListNode m3 = new ListNode(3);
	ListNode n4 = new ListNode(4);
	ListNode m4 = new ListNode(4);

	@Before
	public void init() {
		s = new Solution();
	}

	@Test
	public void test1() {
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = m4;
		m4.next = m3;
		m3.next = m2;
		m2.next = m1;

		assertEquals(true, s.isPalindrome(n1));
		assertEquals(false, s.isPalindrome(n2));
	}

	@Test
	public void test2() {
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = m3;
		m3.next = m2;
		m2.next = m1;

		assertEquals(true, s.isPalindrome(n1));
		assertEquals(false, s.isPalindrome(n2));
	}

	@Test
	public void test3() {
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;

		assertEquals(false, s.isPalindrome(n1));
	}

	@Test
	public void test4() {
		assertEquals(true, s.isPalindrome(n1));
	}

	@Test
	public void test5() {
		n1.next = m1;
		assertEquals(true, s.isPalindrome(n1));
	}

	@Test
	public void test6() {
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = m3;
		m3.next = m4;
		m4.next = m2;
		m2.next = m1;

		assertEquals(false, s.isPalindrome(n1));
	}
}
