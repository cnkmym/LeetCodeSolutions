package romantointeger;

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
		assertEquals(0, s.romanToInt(""));
	}

	@Test
	public void test2() {
		assertEquals(1, s.romanToInt("I"));
		assertEquals(2, s.romanToInt("II"));
		assertEquals(3, s.romanToInt("III"));
		assertEquals(4, s.romanToInt("IV"));
		assertEquals(5, s.romanToInt("V"));
		assertEquals(6, s.romanToInt("VI"));
		assertEquals(7, s.romanToInt("VII"));
		assertEquals(8, s.romanToInt("VIII"));
		assertEquals(9, s.romanToInt("IX"));
		assertEquals(10, s.romanToInt("X"));
	}

	@Test
	public void test3() {
		assertEquals(1954, s.romanToInt("MCMLIV"));
	}

	@Test
	public void test4() {
		assertEquals(1990, s.romanToInt("MCMXC"));
	}

	@Test
	public void test5() {
		assertEquals(2014, s.romanToInt("MMXIV"));
	}
}
