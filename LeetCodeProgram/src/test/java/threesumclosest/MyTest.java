package threesumclosest;

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
	public void test0() {
		assertEquals(0, s.threeSumClosest(new int[] { 0, 0, 0 }, 0));
	}

	@Test
	public void test1() {
		assertEquals(0, s.threeSumClosest(new int[] { -1, 0, 1 }, 0));
	}

	@Test
	public void test2() {
		assertEquals(4, s.threeSumClosest(new int[] { -1, 0, 1, 2, 3 }, 4));
	}

	@Test
	public void test3() {
		assertEquals(0, s.threeSumClosest(new int[] { -1, 0, 1, 2, 3 }, -1));
		assertEquals(0, s.threeSumClosest(new int[] { -1, 0, 1, 2, 3 }, -2));
	}

	@Test
	public void test4() {
		assertEquals(6, s.threeSumClosest(new int[] { -1, 0, 1, 2, 3 }, 6));
		assertEquals(6, s.threeSumClosest(new int[] { -1, 0, 1, 2, 3 }, 7));
	}

	@Test
	public void test5() {
		assertEquals(17, s.threeSumClosest(new int[] { -10, 0, -2, 3, -8, 1, -10, 8, -8, 6, -7, 0, -7, 2, 2, -5, -8, 1,
				-4, 6 }, 18));
	}
}
