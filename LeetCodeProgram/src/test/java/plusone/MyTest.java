package plusone;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class MyTest {
	Solution s;

	@Before
	public void init() {
		s = new Solution();
	}

	private String toString(int[] src) {
		StringBuilder sb = new StringBuilder();
		for (int i : src) {
			sb.append(String.valueOf(i));
		}
		return sb.toString();
	}

	@Test
	public void test1() {
		int[] input = new int[] { 0 };
		int[] exp = new int[] { 1 };
		assertEquals(toString(exp), toString(s.plusOne(input)));
	}

	@Test
	public void test2() {
		int[] input = new int[] { 9 };
		int[] exp = new int[] { 1, 0 };
		assertEquals(toString(exp), toString(s.plusOne(input)));
	}

	@Test
	public void test3() {
		int[] input = new int[] { 9, 9 };
		int[] exp = new int[] { 1, 0, 0 };
		assertEquals(toString(exp), toString(s.plusOne(input)));
	}

	@Test
	public void test4() {
		int[] input = new int[] { 1 };
		int[] exp = new int[] { 2 };
		assertEquals(toString(exp), toString(s.plusOne(input)));
	}
}
