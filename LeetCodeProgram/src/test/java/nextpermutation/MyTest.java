package nextpermutation;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MyTest {
	Solution s;

	@Before
	public void init() {
		s = new Solution();
	}

	@Test
	public void test1() {
		int[] src = new int[0];
		s.nextPermutation(src);
		assertArrayEquals(new int[0], src);
	}

	@Test
	public void test2() {
		int[] src = new int[] { 1 };
		s.nextPermutation(src);
		assertArrayEquals(new int[] { 1 }, src);
	}

	@Test
	public void test3() {
		int[] src = new int[] { 1, 2 };
		s.nextPermutation(src);
		assertArrayEquals(new int[] { 2, 1 }, src);
	}

	@Test
	public void test4() {
		int[] src = new int[] { 1, 2, 3 };
		s.nextPermutation(src);
		assertArrayEquals(new int[] { 1, 3, 2 }, src);
		s.nextPermutation(src);
		assertArrayEquals(new int[] { 2, 1, 3 }, src);
		s.nextPermutation(src);
		assertArrayEquals(new int[] { 2, 3, 1 }, src);
		s.nextPermutation(src);
		assertArrayEquals(new int[] { 3, 1, 2 }, src);
		s.nextPermutation(src);
		assertArrayEquals(new int[] { 3, 2, 1 }, src);
		s.nextPermutation(src);
		assertArrayEquals(new int[] { 1, 2, 3 }, src);
	}

	@Test
	public void test5() {
		int[] src = new int[] { 1, 2, 3, 4 };
		s.nextPermutation(src);
		assertArrayEquals(new int[] { 1, 2, 4, 3 }, src);
		s.nextPermutation(src);
		assertArrayEquals(new int[] { 1, 3, 2, 4 }, src);
		s.nextPermutation(src);
		assertArrayEquals(new int[] { 1, 3, 4, 2 }, src);
		s.nextPermutation(src);
		assertArrayEquals(new int[] { 1, 4, 2, 3 }, src);
		s.nextPermutation(src);
		assertArrayEquals(new int[] { 1, 4, 3, 2 }, src);
		s.nextPermutation(src);
		assertArrayEquals(new int[] { 2, 1, 3, 4 }, src);
		s.nextPermutation(src);
		assertArrayEquals(new int[] { 2, 1, 4, 3 }, src);
		s.nextPermutation(src);
		assertArrayEquals(new int[] { 2, 3, 1, 4 }, src);
		s.nextPermutation(src);
		assertArrayEquals(new int[] { 2, 3, 4, 1 }, src);
		s.nextPermutation(src);
		assertArrayEquals(new int[] { 2, 4, 1, 3 }, src);
		s.nextPermutation(src);
		assertArrayEquals(new int[] { 2, 4, 3, 1 }, src);
	}

	@Test
	public void test6() {
		int[] src = new int[] { 1, 1, 5 };
		s.nextPermutation(src);
		assertArrayEquals(new int[] { 1, 5, 1 }, src);
		s.nextPermutation(src);
		assertArrayEquals(new int[] { 5, 1, 1 }, src);
		s.nextPermutation(src);
		assertArrayEquals(new int[] { 1, 1, 5 }, src);
	}
}
