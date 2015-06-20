package uniquepath;

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
	public void test0() {
		assertEquals(1, s.uniquePaths(1, 1));
	}

	@Test
	public void test1() {
		assertEquals(1, s.uniquePaths(1, 5));
		assertEquals(1, s.uniquePaths(5, 1));
	}

	@Test
	public void test2() {
		assertEquals(2, s.uniquePaths(2, 2));
	}

	@Test
	public void test3() {
		assertEquals(3, s.uniquePaths(2, 3));
	}

	@Test
	public void test4() {
		assertEquals(5, s.uniquePaths(5, 2));
	}

	@Test
	public void test5() {
		assertEquals(6, s.uniquePaths(3, 3));
	}
}
