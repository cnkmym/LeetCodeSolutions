package jumpgame;

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
		assertEquals(false, s.canJump(new int[] {}));
	}

	@Test
	public void test2() {
		assertEquals(true, s.canJump(new int[] { 1 }));
	}

	@Test
	public void test3() {
		assertEquals(true, s.canJump(new int[] { 2, 3, 1, 1, 4 }));
	}

	@Test
	public void test4() {
		assertEquals(false, s.canJump(new int[] { 3, 2, 1, 0, 4 }));
	}

	@Test
	public void test5() {
		assertEquals(true, s.canJump(new int[] { 3, 0, 2, 0, 0 }));
	}

	@Test
	public void test6() {
		assertEquals(true,
				s.canJump(new int[] { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }));
	}
}
