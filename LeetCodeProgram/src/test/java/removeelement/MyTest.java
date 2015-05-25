package removeelement;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class MyTest {
	Solution s;
	int[] data;

	@Before
	public void init() {
		s = new Solution();
	}

	@Test
	public void test1() {
		assertEquals(0, s.removeElement(new int[0], 1));
	}

	@Test
	public void test2() {
		assertEquals(0, s.removeElement(new int[] { 0 }, 0));
	}

	@Test
	public void test3() {
		assertEquals(1, s.removeElement(new int[] { 0, 1, 1, 1, 1, 1, 1, 1, 1 }, 1));
	}
}
