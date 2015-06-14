package searchforarange;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class MyTest {
	Solution s;

	@Before
	public void init() {
		s = new Solution();
	}

	@Test
	public void test1() {
		assertArrayEquals(new int[] { -1, -1 }, s.searchRange(null, 0));
		assertArrayEquals(new int[] { -1, -1 }, s.searchRange(new int[] {}, 0));
	}

	@Test
	public void test2() {
		assertArrayEquals(new int[] { 0, 0 }, s.searchRange(new int[] { 0 }, 0));
		assertArrayEquals(new int[] { -1, -1 }, s.searchRange(new int[] { 0 }, 1));
	}

	@Test
	public void test3() {
		assertArrayEquals(new int[] { 0, 3 }, s.searchRange(new int[] { 0, 0, 0, 0 }, 0));
	}

	@Test
	public void test4() {
		assertArrayEquals(new int[] { 4, 4 }, s.searchRange(new int[] { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 }, 4));
	}

	@Test
	public void test5() {
		assertArrayEquals(new int[] { 5, 8 }, s.searchRange(new int[] { 0, 1, 2, 3, 4, 5, 5, 5, 5, 6, 7, 8, 9 }, 5));
	}
}
