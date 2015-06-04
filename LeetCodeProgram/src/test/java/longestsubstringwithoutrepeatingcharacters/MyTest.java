package longestsubstringwithoutrepeatingcharacters;

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
		String v = "";
		assertEquals(0, s.lengthOfLongestSubstring(v));
	}
	
	public void test11() {
		String v = "a";
		assertEquals(1, s.lengthOfLongestSubstring(v));
	}

	@Test
	public void test2() {
		String v = "aaaaaaaa";
		assertEquals(1, s.lengthOfLongestSubstring(v));
	}

	@Test
	public void test3() {
		String v = "abababab";
		assertEquals(2, s.lengthOfLongestSubstring(v));
	}

	@Test
	public void test4() {
		String v = "abcabcbb";
		assertEquals(3, s.lengthOfLongestSubstring(v));
	}

	@Test
	public void test5() {
		String v = "abcdbcdea";
		assertEquals(5, s.lengthOfLongestSubstring(v));
	}
	
	@Test
	public void test6() {
		String v = "aab";
		assertEquals(2, s.lengthOfLongestSubstring(v));
	}
}
