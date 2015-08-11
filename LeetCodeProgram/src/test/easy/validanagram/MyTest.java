package validanagram;

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
		assertEquals(false, s.isAnagram(null, null));
		assertEquals(false, s.isAnagram(null, ""));
		assertEquals(false, s.isAnagram("", null));
		assertEquals(true, s.isAnagram("", ""));
	}

	@Test
	public void test2() {
		assertEquals(true, s.isAnagram("", ""));
		assertEquals(true, s.isAnagram(" ", " "));
	}

	@Test
	public void test3() {
		assertEquals(true, s.isAnagram("cat", "tac"));
		assertEquals(true, s.isAnagram("cat", "act"));
	}

	@Test
	public void test4() {
		assertEquals(false, s.isAnagram("catttt", "tttacc"));
		assertEquals(false, s.isAnagram("catttt", "accatt"));
	}
}
