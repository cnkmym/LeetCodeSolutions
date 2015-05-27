package climbingstairs;

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
		assertEquals(0, s.climbStairs(-1));
		assertEquals(0, s.climbStairs(0));
	}

	@Test
	public void test2() {
		assertEquals(1, s.climbStairs(1));
	}

	@Test
	public void test3() {
		assertEquals(2, s.climbStairs(2));
	}

	@Test
	public void test4() {
		assertEquals(3, s.climbStairs(3));
	}
}
