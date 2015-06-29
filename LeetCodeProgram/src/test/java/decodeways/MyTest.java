package decodeways;

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
		String input = "12";// AB, L
		assertEquals(2, s.numDecodings(input));
	}

	@Test
	public void test2() {
		String input = "26";// BF, Z
		assertEquals(2, s.numDecodings(input));
	}

	@Test
	public void test3() {
		String input = "";//
		assertEquals(0, s.numDecodings(input));
	}

	@Test
	public void test4() {
		String input = "1727";// AGBG, QBG
		assertEquals(2, s.numDecodings(input));
	}

	@Test
	public void test5() {
		String input = "1111";// AAAA,KK,KAA,AKA,AAK
		assertEquals(5, s.numDecodings(input));
	}

	@Test
	public void test6() {
		String input = "0";//
		assertEquals(0, s.numDecodings(input));
	}

	@Test
	public void test7() {
		String input = "100";//
		assertEquals(0, s.numDecodings(input));
	}

	@Test
	public void test8() {
		String input = "10";//
		assertEquals(1, s.numDecodings(input));
	}

	@Test
	public void test9() {
		String input = "1020";//
		assertEquals(1, s.numDecodings(input));
	}
	
	@Test
	public void test10() {
		String input = "120";//
		assertEquals(1, s.numDecodings(input));
	}
	
	@Test
	public void test11() {
		String input = "20210";//
		assertEquals(1, s.numDecodings(input));
	}
}
