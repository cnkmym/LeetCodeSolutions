package pow;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class MyTest {
	Solution s;
	private final double delta = 0.0000000000000000001;

	@Before
	public void init() {
		s = new Solution();
	}

	@Test
	public void test0() {
		assertEquals(1, s.myPow(0.00001, 0), delta);
	}

	@Test
	public void test1() {
		assertEquals(0, s.myPow(0, 10), delta);
	}

	@Test
	public void test2() {
		assertEquals(1, s.myPow(1, 10), delta);
	}

	@Test
	public void test3() {
		assertEquals(1024, s.myPow(2, 10), delta);
	}

	@Test
	public void test4() {
		assertEquals(9765625, s.myPow(5, 10), delta);
	}

	@Test
	public void test5() {
		assertEquals(0, s.myPow(0.00001, 2147483647), delta);
	}

	@Test
	public void test6() {
		assertEquals(0.00003, s.myPow(34.00515, -3), delta);
	}
}
