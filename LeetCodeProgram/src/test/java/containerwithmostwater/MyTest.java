package containerwithmostwater;

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
		int[] height = new int[] { 1, 1 };
		assertEquals(1, s.maxArea(height));
	}

	@Test
	public void test2() {
		int[] height = new int[] { 1, 0, 2, 0, 1 };
		assertEquals(4, s.maxArea(height));
	}
	
	@Test
	public void test3() {
		int[] height = new int[] { 3, 4, 5, 0, 1 };
		assertEquals(6, s.maxArea(height));
	}
	
	@Test
	public void test4() {
		int[] height = new int[] { 2, 4, 5, 0, 3 };
		assertEquals(9, s.maxArea(height));
	}
}
