package longestcommonprefix;

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
		assertEquals("", s.longestCommonPrefix(new String[] {}));
		assertEquals("", s.longestCommonPrefix(new String[] { "" }));
	}

	@Test
	public void test2() {
		assertEquals("a", s.longestCommonPrefix(new String[] { "a" }));
	}

	@Test
	public void test3() {
		assertEquals("", s.longestCommonPrefix(new String[] { "a", "b" }));
		assertEquals("", s.longestCommonPrefix(new String[] { "a", "b", "ba" }));
	}

	@Test
	public void test4() {
		assertEquals("a", s.longestCommonPrefix(new String[] { "a", "ab" }));
	}

	@Test
	public void test5() {
		assertEquals("ab", s.longestCommonPrefix(new String[] { "ab1", "ab2", "abc3" }));
	}
}
