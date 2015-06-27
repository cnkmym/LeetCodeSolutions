package searchinrotatedsortedarray;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import searchinrotatedsortedarray.Solution;

public class MyTest {
	Solution s;

	@Before
	public void init() {
		s = new Solution();
	}

	@Test
	public void test1() {
		assertEquals(-1, s.search(new int[] {}, 1));
	}

	@Test
	public void test2() {
		assertEquals(0, s.search(new int[] { 1 }, 1));
	}

	@Test
	public void test3() {
		assertEquals(1, s.search(new int[] { 0, 1, 2, -3, -2, -1 }, 1));
	}

	@Test
	public void test4() {
		assertEquals(1, s.search(new int[] { 0, 1, 2, 3 }, 1));
	}

	@Test
	public void test5() {
		assertEquals(0, s.search(new int[] { 1, -3, -2, -1, 0 }, 1));
	}

	@Test
	public void test6() {
		assertEquals(16, s.search(new int[] { 3, 4, 5, 6, 7, 8, 9, -9, -8, -7, -6 - 5, -4, -3, -2, -1, 0, 1, 2 }, 1));
	}

	@Test
	public void test7() {
		assertEquals(15, s.search(new int[] { 3, 4, 5, 6, 7, 8, 9, -9, -8, -7, -6 - 5, -4, -3, -2, -1, 1, 2 }, 1));
	}

	@Test
	public void test8() {
		assertEquals(1, s.search(new int[] { 1, 2, 3 }, 2));
	}

	@Test
	public void test9() {
		assertEquals(1, s.search(new int[] { 1, 3 }, 3));
	}

	@Test
	public void test10() {
		assertEquals(1, s.search(new int[] { 3, 1 }, 1));
	}

	@Test
	public void test11() {
		assertEquals(1, s.search(new int[] { 3, 4, 5, 6, 7, 1, 2 }, 4));
	}
}
