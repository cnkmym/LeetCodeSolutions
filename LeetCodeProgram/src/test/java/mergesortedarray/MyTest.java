package mergesortedarray;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class MyTest {
	Solution s;
	int[] a;
	int[] b;
	int[] exp;

	@Before
	public void init() {
		s = new Solution();
	}

	private String print(int[] v) {
		StringBuilder sb = new StringBuilder();
		for (int i : v) {
			sb.append(i);
			sb.append("->");
		}
		return sb.toString();
	}

	@Test
	public void test1() {
		a = new int[] { 1, 2, 3, 0, 0 };
		b = new int[] { 2, 5 };
		exp = new int[] { 1, 2, 2, 3, 5 };
		s.merge(a, 3, b, 2);
		assertEquals(print(exp), print(a));
	}

	@Test
	public void test2() {
		a = new int[] { 0, 1, 2, 3, 0, 0 };
		b = new int[] { 1, 1 };
		exp = new int[] { 0, 1, 1, 1, 2, 3 };
		s.merge(a, 4, b, 2);
		assertEquals(print(exp), print(a));
	}

	@Test
	public void test3() {
		a = new int[] { 0, 1, 2, 3, 0, 0 };
		b = new int[] {};
		exp = new int[] { 0, 1, 2, 3, 0, 0 };
		s.merge(a, 4, b, 0);
		assertEquals(print(exp), print(a));
	}

	@Test
	public void test4() {
		a = new int[] { 1, 1, 0, 0, 0 };
		b = new int[] { 1, 2, 3 };
		exp = new int[] { 1, 1, 1, 2, 3 };
		s.merge(a, 2, b, 3);
		assertEquals(print(exp), print(a));
	}
}
