package removeduplicates;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class MyTest {
	Solution s;

	@Before
	public void init() {
		s = new Solution();
	}

	private String print(int[] nums, int count) {
		StringBuilder sb = new StringBuilder();
		sb.append("[");
		for (int i = 0; i < count; i++) {
			sb.append(nums[i]);
			sb.append(",");
		}
		sb.append("]");
		return sb.toString();
	}

	@Test
	public void test1() {
		int[] nums = new int[] {};
		int count = s.removeDuplicates(nums);
		assertEquals("[]", print(nums, count));
	}

	@Test
	public void test2() {
		int[] nums = new int[] { 1 };
		int count = s.removeDuplicates(nums);
		assertEquals("[1,]", print(nums, count));
	}

	@Test
	public void test3() {
		int[] nums = new int[] { 1, 2, 3 };
		int count = s.removeDuplicates(nums);
		assertEquals("[1,2,3,]", print(nums, count));
	}

	@Test
	public void test4() {
		int[] nums = new int[] { 1, 2, 2 };
		int count = s.removeDuplicates(nums);
		assertEquals("[1,2,2,]", print(nums, count));
	}

	@Test
	public void test5() {
		int[] nums = new int[] { 3, 2, 3 };
		int count = s.removeDuplicates(nums);
		assertEquals("[2,3,3,]", print(nums, count));
	}

	@Test
	public void test6() {
		int[] nums = new int[] { 1, 2, 1, 3, 4, 2, 1, 3, 2 };
		int count = s.removeDuplicates(nums);
		assertEquals("[1,1,2,2,3,3,4,]", print(nums, count));
	}

}
