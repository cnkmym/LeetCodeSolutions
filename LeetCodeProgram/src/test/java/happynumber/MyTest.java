package happynumber;

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
		assertEquals(true, s.isHappy(1));
		assertEquals(true, s.isHappy(10));
		assertEquals(true, s.isHappy(100));
	}

	@Test
	public void test2() {
		// 2, 4, 16, 37, 58, 89, 145, 42, 20, 4
		assertEquals(false, s.isHappy(2));
		assertEquals(false, s.isHappy(4));
	}

	@Test
	public void test3() {
		// 3, 9, 81, 65, 61, 37, 58,...
		assertEquals(false, s.isHappy(3));
		assertEquals(false, s.isHappy(9));
	}

	@Test
	public void test5() {
		// 5, 25, 29, 85, 89, ...
		assertEquals(false, s.isHappy(5));
	}

	@Test
	public void test6() {
		// 6, 36, 45, 41, 17, 50, 25, ...
		assertEquals(false, s.isHappy(6));
	}

	@Test
	public void test7() {
		// 7, 49, 97, 130, 10, 1
		assertEquals(false, s.isHappy(6));
	}

	@Test
	public void test8() {
		// 8, 64, 42, ...
		assertEquals(false, s.isHappy(8));
	}
}
