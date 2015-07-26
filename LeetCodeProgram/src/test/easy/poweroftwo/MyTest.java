package poweroftwo;

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
		assertEquals(false, s.isPowerOfTwo(0));
	}

	@Test
	public void test2() {
		assertEquals(true, s.isPowerOfTwo(1));
	}

	@Test
	public void test3() {
		assertEquals(true, s.isPowerOfTwo(2));
	}

	@Test
	public void test4() {
		assertEquals(false, s.isPowerOfTwo(3));
	}

	@Test
	public void test5() {
		assertEquals(true, s.isPowerOfTwo(4));
	}

	@Test
	public void test6() {
		assertEquals(true, s.isPowerOfTwo(1024));
	}
}
