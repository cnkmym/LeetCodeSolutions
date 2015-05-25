package removeduplicatedfromsortedarray;

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
	public void test0() {
		data = new int[] {};
		assertEquals(0, s.removeDuplicates(data));
	}

	@Test
	public void test1() {
		data = new int[] { 1, 2, 3, 4, 5, 6, 7 };
		assertEquals(7, s.removeDuplicates(data));
	}

	@Test
	public void test2() {
		data = new int[] { 1, 2, 2, 2, 2, 2, 7 };
		assertEquals(3, s.removeDuplicates(data));
	}

	@Test
	public void test3() {
		data = new int[] { 1, 1, 1, 1, 1, 1, 1, 1, 1 };
		assertEquals(1, s.removeDuplicates(data));
	}

	@Test
	public void test4() {
		data = new int[] { 1, 2, 2, 4, 4, 6, 6, 7, 7 };
		assertEquals(5, s.removeDuplicates(data));
		assertEquals(1, data[0]);
		assertEquals(2, data[1]);
		assertEquals(4, data[2]);
		assertEquals(6, data[3]);
		assertEquals(7, data[4]);
	}
}
