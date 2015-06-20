package minimumpathsum;

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
		int[][] weight = new int[][] {//
		new int[] { 1 } };
		assertEquals(1, s.minPathSum(weight));
	}

	@Test
	public void test2() {
		int[][] weight = new int[][] {//
		new int[] { 1 }, //
				new int[] { 2 } };
		assertEquals(3, s.minPathSum(weight));
	}

	@Test
	public void test3() {
		int[][] weight = new int[][] {//
		new int[] { 1, 1 }, //
				new int[] { 2, 2 },//
				new int[] { 3, 3 } //
		};
		assertEquals(7, s.minPathSum(weight));
	}

	@Test
	public void test4() {
		int[][] weight = new int[][] {//
				new int[] { 1, 1, 3 }, //
				new int[] { 2, 1, 2 },//
				new int[] { 1, 3, 3 } //
		};
		assertEquals(8, s.minPathSum(weight));
	}
}
