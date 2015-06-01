package rotatearray;

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
		int[] src = new int[] {};
		int[] exp = new int[] {};
		s.rotate(src, 0);
		assertArrayEquals(exp, src);
	}

	@Test
	public void test2() {
		int[] src = new int[] { 1, 2, 3 };
		int[] exp = new int[] { 3, 1, 2 };
		s.rotate(src, 1);
		assertArrayEquals(exp, src);
	}

	@Test
	public void test3() {
		int[] src = new int[] { 1, 2, 3 };
		int[] exp = new int[] { 2, 3, 1 };
		s.rotate(src, 2);
		assertArrayEquals(exp, src);
	}

	@Test
	public void test4() {
		int[] src = new int[] { 1, 2, 3 };
		int[] exp = new int[] { 1, 2, 3 };
		s.rotate(src, 3);
		assertArrayEquals(exp, src);
	}
}
