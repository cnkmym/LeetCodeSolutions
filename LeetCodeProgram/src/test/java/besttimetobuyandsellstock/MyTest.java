package besttimetobuyandsellstock;

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
		assertEquals(0, s.maxProfit(new int[0]));
	}

	@Test
	public void test2() {
		assertEquals(0, s.maxProfit(new int[] { 1 }));
		assertEquals(0, s.maxProfit(new int[] { 1, 0 }));
	}

	@Test
	public void test3() {
		assertEquals(2, s.maxProfit(new int[] { 1, 2, 3 }));
	}

	@Test
	public void test4() {
		assertEquals(2, s.maxProfit(new int[] { 5, 6, 1, 2, 3 }));
	}

	@Test
	public void test5() {
		assertEquals(2, s.maxProfit(new int[] { 5, 6, 1, 2, -1, 1, 1, 0 }));
	}

	@Test
	public void test6() {
		assertEquals(4, s.maxProfit(new int[] { 3, 2, 6, 5, 0, 3 }));
	}
}
