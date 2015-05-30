package validpalindrome;

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
		assertEquals(true, s.isPalindrome(""));
	}

	@Test
	public void test2() {
		assertEquals(true, s.isPalindrome("abcddcba"));
	}

	@Test
	public void test3() {
		assertEquals(true, s.isPalindrome("aba"));
	}

	@Test
	public void test4() {
		assertEquals(true, s.isPalindrome("AbBA"));
	}

	@Test
	public void test5() {
		assertEquals(true, s.isPalindrome("A man, a plan, a canal: Panama"));
	}

	@Test
	public void test6() {
		assertEquals(false, s.isPalindrome("race a car"));
	}

}
