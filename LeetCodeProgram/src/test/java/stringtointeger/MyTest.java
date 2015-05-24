package stringtointeger;

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
		assertEquals(123, s.myAtoi("         +123      adfadsf"));
	}
	
	@Test
	public void test2() {
		assertEquals(123, s.myAtoi("         123      adfadsf"));
	}
	
	@Test
	public void test3() {
		assertEquals(0, s.myAtoi("         +-123      adfadsf"));
	}
	
	@Test
	public void test4() {
		assertEquals(0, s.myAtoi("         "));
		assertEquals(0, s.myAtoi("      avc   "));
		assertEquals(0, s.myAtoi("    +0     "));
		assertEquals(0, s.myAtoi("     -0    "));
		assertEquals(0, s.myAtoi("    a+123    "));
	}
	
	@Test
	public void test5() {
		assertEquals(2147483647, s.myAtoi(" +2147483648"));
	}
	
	@Test
	public void test6() {
		assertEquals(-2147483648, s.myAtoi(" -2147483648"));
	}
}
