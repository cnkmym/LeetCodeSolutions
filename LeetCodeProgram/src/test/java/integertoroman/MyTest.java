package integertoroman;

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
		assertEquals("", s.intToRoman(0));
	}

	@Test
	public void test2() {
		assertEquals("I", s.intToRoman(1));
		assertEquals("II", s.intToRoman(2));
		assertEquals("III", s.intToRoman(3));
		assertEquals("IV", s.intToRoman(4));
		assertEquals("V", s.intToRoman(5));
		assertEquals("VI", s.intToRoman(6));
		assertEquals("VII", s.intToRoman(7));
		assertEquals("VIII", s.intToRoman(8));
		assertEquals("IX", s.intToRoman(9));
		assertEquals("X", s.intToRoman(10));
	}

	@Test
	public void test3() {
		assertEquals("MCMLIV", s.intToRoman(1954));
	}

	@Test
	public void test4() {
		assertEquals("MCMXC", s.intToRoman(1990));
	}

	@Test
	public void test5() {
		assertEquals("MMXIV", s.intToRoman(2014));
	}
}
