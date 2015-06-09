package foursum;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class MyTest {
	Solution s;

	@Before
	public void init() {
		s = new Solution();
	}

	private String[] convert(List<List<Integer>> ret) {
		String[] array = new String[ret.size()];
		int index = 0;
		for (List<Integer> integers : ret) {
			StringBuilder sb = new StringBuilder();
			for (Integer v : integers) {
				sb.append(v);
				sb.append(",");
			}
			array[index++] = sb.toString();
		}
		return array;
	}

	@Test
	public void test0() {
		assertArrayEquals(new String[] {}, convert(s.fourSum(new int[] { 0, 0, 0 }, 0)));
		assertArrayEquals(new String[] { "0,0,0,0," }, convert(s.fourSum(new int[] { 0, 0, 0, 0 }, 0)));
	}

	@Test
	public void test1() {
		assertEquals(0, s.fourSum(new int[] {}, 2).size());
		assertEquals(0, s.fourSum(new int[] {}, 0).size());
		assertEquals(0, s.fourSum(new int[] { 1, 2, 3 }, 2).size());
		assertEquals(0, s.fourSum(new int[] { 1, 2, 3, 4 }, 12).size());
	}

	@Test
	public void test2() {
		assertArrayEquals(new String[] { "-2,-1,1,2,", "-2,0,0,2,", "-1,0,0,1," },
				convert(s.fourSum(new int[] { 1, 0, -1, 0, -2, 2 }, 0)));
	}

	@Test
	public void test3() {
		assertArrayEquals(new String[] {}, convert(s.fourSum(new int[] { 3, 1, 4, 2, 5, -4, 2, 4, -5 }, -12)));
	}

	@Test
	public void test4() {
		// [-1,-5,-5,-3,2,5,0,4], -7
		// [-5,-5,-1,4],[-5,-3,-1,2]
		assertArrayEquals(new String[] { "-5,-5,-1,4,", "-5,-3,-1,2," },
				convert(s.fourSum(new int[] { -1, -5, -5, -3, 2, 5, 0, 4 }, -7)));
	}

	@Test
	public void test5() {
		assertArrayEquals(new String[] { "-5,-3,-1,4," }, convert(s.fourSum(new int[] { 4, 0, -5, -1, -5, 2, -3 }, -5)));
	}
}
