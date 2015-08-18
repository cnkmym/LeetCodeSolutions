package adddigits;

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
		assertEquals(0, s.addDigits(0));
	}

	@Test
	public void test2() {
		assertEquals(6, s.addDigits(6));
	}

	@Test
	public void test3() {
		assertEquals(9, s.addDigits(99));
	}

	@Test
	public void test4() {
		assertEquals(3, s.addDigits(183));
	}

	@Test
	public void test5() {
		assertEquals(8, s.addDigits(6245));
	}

	@Test
	public void test6() {
		assertEquals(4, s.addDigits(85342));
	}
}
