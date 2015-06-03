package twosum;

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
		assertEquals(null, s.twoSum(null, 0));
	}

	@Test
	public void test2() {
		assertArrayEquals(new int[] { 1, 2 }, s.twoSum(new int[] { 1, 2, 3, 4, 5 }, 3));
	}

	@Test
	public void test3() {
		assertArrayEquals(new int[] { 3, 5 }, s.twoSum(new int[] { 1, 2, 3, 4, 5 }, 8));
	}
}
