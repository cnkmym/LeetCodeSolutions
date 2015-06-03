package addbinary;

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
		String a = "11";
		String b = "1";
		assertEquals("100", s.addBinary(a, b));
	}

	@Test
	public void test2() {
		String a = "";
		String b = "";
		assertEquals("0", s.addBinary(a, b));
	}

	@Test
	public void test3() {
		String a = "11";
		String b = "";
		assertEquals("11", s.addBinary(a, b));
	}

	@Test
	public void test4() {
		String a = "111";
		String b = "1";
		assertEquals("1000", s.addBinary(a, b));
	}

	@Test
	public void test5() {
		String a = "10";
		String b = "1";
		assertEquals("11", s.addBinary(a, b));
	}

	@Test
	public void test6() {
		String a = "1";
		String b = "10";
		assertEquals("11", s.addBinary(a, b));
	}
	
	@Test
	public void test7() {
		String a = "1010";
		String b = "1011";
		assertEquals("10101", s.addBinary(a, b));
	}
}
