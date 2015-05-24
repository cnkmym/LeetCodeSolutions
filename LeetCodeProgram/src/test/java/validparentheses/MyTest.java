package validparentheses;

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
		assertEquals(true, s.isValid(""));
	}

	@Test
	public void test2() {
		assertEquals(true, s.isValid("{}"));
	}

	@Test
	public void test3() {
		assertEquals(true, s.isValid("[]"));
	}

	@Test
	public void test4() {
		assertEquals(true, s.isValid("()"));
	}

	@Test
	public void test5() {
		assertEquals(true, s.isValid("{[()()]}"));
	}

	@Test
	public void test6() {
		assertEquals(true, s.isValid("{[][()]}"));
	}

	@Test
	public void test7() {
		assertEquals(true, s.isValid("()[]{}"));
	}

	@Test
	public void test8() {
		assertEquals(false, s.isValid("([)]"));
	}

	@Test
	public void test9() {
		assertEquals(false, s.isValid("{[][)(]}"));
	}

	@Test
	public void test10() {
		assertEquals(false, s.isValid("}{"));
	}

	@Test
	public void test11() {
		assertEquals(false, s.isValid("{})("));
	}
}
