package maximumsubarray;

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
		assertEquals(0, s.maxSubArray(new int[] {}));
	}

	@Test
	public void test2() {
		assertEquals(-5, s.maxSubArray(new int[] { -5, -6 }));
	}

	@Test
	public void test3() {
		assertEquals(12, s.maxSubArray(new int[] { 5, 6, 1 }));
	}

	@Test
	public void test4() {
		assertEquals(1, s.maxSubArray(new int[] { -5, 1, -5 }));
	}

	@Test
	public void test5() {
		assertEquals(6, s.maxSubArray(new int[] { -2, 1, -3, 4, -1, 2, 1, -5, 4 }));
	}
}
