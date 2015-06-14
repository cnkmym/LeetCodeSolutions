package searchinsertposition;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class MyTest {
	Solution s;

	@Before
	public void init() {
		s = new Solution();
	}

	@Test
	public void test1() {
		assertEquals(0, s.searchInsert(new int[] {}, 1));
	}

	@Test
	public void test2() {
		assertEquals(0, s.searchInsert(new int[] { 1 }, 1));
	}

	@Test
	public void test3() {
		assertEquals(0, s.searchInsert(new int[] { 2 }, 1));
	}

	@Test
	public void test4() {
		assertEquals(5, s.searchInsert(new int[] { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 }, 5));
	}

	@Test
	public void test5() {
		assertEquals(5, s.searchInsert(new int[] { 0, 1, 2, 3, 4, 6, 7, 8, 9 }, 5));
	}
	
	@Test
	public void test6() {
		assertEquals(9, s.searchInsert(new int[] { 0, 1, 2, 3, 4, 6, 7, 8, 9 }, 10));
	}
}
