package reverseinteger;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class MyTest {
	private Solution s;

	@Before
	public void init() {
		s = new Solution();
	}

	@Test
	public void test1() {
		assertEquals(-1, s.reverse(-1));
	}

	@Test
	public void test2() {
		assertEquals(123, s.reverse(321));
	}

	@Test
	public void test3() {
		assertEquals(0, s.reverse(0));
	}

	@Test
	public void test4() {
		assertEquals(-1, s.reverse(-10));
	}

	@Test
	public void test5() {
		assertEquals(-1, s.reverse(-100));
	}

	@Test
	public void test6() {
		assertEquals(321, s.reverse(123));
	}

	@Test
	public void test7() {
		assertEquals(0, s.reverse(Integer.MAX_VALUE + 1));
	}

	@Test
	public void test8() {
		assertEquals(0, s.reverse(Integer.MIN_VALUE - 1));
	}
}
