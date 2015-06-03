package isomophicstring;

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
		assertEquals(true, s.isIsomorphic(null, null));
		assertEquals(true, s.isIsomorphic("", ""));
	}

	@Test
	public void test2() {
		assertEquals(true, s.isIsomorphic("egg", "add"));
	}

	@Test
	public void test3() {
		assertEquals(false, s.isIsomorphic("foo", "bar"));
	}

	@Test
	public void test4() {
		assertEquals(true, s.isIsomorphic("paper", "title"));
	}

	@Test
	public void test5() {
		// pay attention to the reverse type
		assertEquals(false, s.isIsomorphic("bar", "foo"));
	}
}
