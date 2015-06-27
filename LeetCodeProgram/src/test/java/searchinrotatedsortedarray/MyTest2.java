package searchinrotatedsortedarray;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class MyTest2 {
	Solution2 s;

	@Before
	public void init() {
		s = new Solution2();
	}

	@Test
	public void test1() {
		assertEquals(false, s.search(new int[] {}, 1));
	}

	@Test
	public void test2() {
		assertEquals(true, s.search(new int[] { 1 }, 1));
	}

	@Test
	public void test3() {
		assertEquals(true, s.search(new int[] { 0, 0, 1, 1, 2, -3, -3, -3, -2, -1, 0 }, 1));
		assertEquals(true, s.search(new int[] { 0, 0, 0, 1, 2, 0, 0, 0, 0, 0, 0 }, 1));
	}

	@Test
	public void test4() {
		assertEquals(true, s.search(new int[] { 0, 0, 0, 1, 2, 3, 3 }, 1));
	}

	@Test
	public void test5() {
		assertEquals(true, s.search(new int[] { 1, -3, -2, -1, 0, 0, 0 }, 1));
	}

	@Test
	public void test6() {
		assertEquals(true, s.search(new int[] { 3, 4, 5, 6, 7, 8, 9, -9, -8, -7, -6 - 5, -4, -3, -2, -1, 0, 1, 2 }, 1));
	}

	@Test
	public void test7() {
		assertEquals(true, s.search(new int[] { 3, 4, 5, 6, 7, 8, 9, -9, -8, -7, -6 - 5, -4, -3, -2, -1, 1, 2 }, 1));
	}

	@Test
	public void test8() {
		assertEquals(true, s.search(new int[] { 1, 2, 2, 3, 1 }, 2));
		assertEquals(true, s.search(new int[] { 1, 2, 2, 3, 1 }, 3));
		assertEquals(true, s.search(new int[] { 1, 3, 1, 1, 1 }, 3));
	}

	@Test
	public void test9() {
		assertEquals(true, s.search(new int[] { 1, 1, 3 }, 3));
	}

	@Test
	public void test10() {
		assertEquals(true, s.search(new int[] { 3, 3, 1 }, 1));
		assertEquals(false, s.search(new int[] { 3, 3, 1 }, 0));
	}

	@Test
	public void test11() {
		assertEquals(true, s.search(new int[] { 3, 3, 3, 4, 5, 6, 7, 1, 2 }, 4));
		assertEquals(false, s.search(new int[] { 3, 3, 3, 4, 5, 6, 7, 1, 2 }, 0));
		assertEquals(false, s.search(new int[] { 3, 3, 3, 4, 5, 6, 7, 1, 2 }, 8));
	}
}
