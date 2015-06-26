package sortcolors;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class MyTest {
	Solution s;

	@Before
	public void init() {
		s = new Solution();
	}

	private String print(int[] nums) {
		StringBuilder sb = new StringBuilder();
		sb.append("[");
		for (int i = 0; i < nums.length; i++) {
			sb.append(nums[i]);
			sb.append(",");
		}
		sb.append("]");
		return sb.toString();
	}

	@Test
	public void test1() {
		int[] data = new int[] {};
		s.sortColors(data);
		assertEquals("[]", print(data));
	}

	@Test
	public void test2() {
		int[] data = new int[] { 1 };
		s.sortColors(data);
		assertEquals("[1,]", print(data));
	}

	@Test
	public void test3() {
		int[] data = new int[] { 1, 0 };
		s.sortColors(data);
		assertEquals("[0,1,]", print(data));
	}

	@Test
	public void test4() {
		int[] data = new int[] { 2, 1, 0, };
		s.sortColors(data);
		assertEquals("[0,1,2,]", print(data));
	}

	@Test
	public void test5() {
		int[] data = new int[] { 1, 0, 0, 2, 1, 0, 0, 0, 1, 2, 1, 0 };
		s.sortColors(data);
		assertEquals("[0,0,0,0,0,0,1,1,1,1,2,2,]", print(data));
	}

	@Test
	public void test6() {
		int[] data = new int[] { 0, 2, 1, 2, 1, 2, 1, 0, 1, 2, 1, 2, 1, 1 };
		s.sortColors(data);
		assertEquals("[0,0,1,1,1,1,1,1,1,2,2,2,2,2,]", print(data));
	}

	@Test
	public void test7() {
		int[] data = new int[] { 2, 0 };
		s.sortColors(data);
		assertEquals("[0,2,]", print(data));
	}

	@Test
	public void test8() {
		int[] data = new int[] { 2, 1 };
		s.sortColors(data);
		assertEquals("[1,2,]", print(data));
	}

	@Test
	public void test9() {
		int[] data = new int[] { 2 };
		s.sortColors(data);
		assertEquals("[2,]", print(data));
	}

}
