package multiplystrings;

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
		assertEquals("0", s.multiply("11111", "0"));
		assertEquals("0", s.multiply("0", "111111111"));
	}

	@Test
	public void test2() {
		assertEquals("11111", s.multiply("11111", "1"));
		assertEquals("2222222222", s.multiply("2", "1111111111"));
	}

	@Test
	public void test3() {
		assertEquals("998001", s.multiply("999", "999"));
		assertEquals("99999999980000000001", s.multiply("9999999999", "9999999999"));
	}
}
