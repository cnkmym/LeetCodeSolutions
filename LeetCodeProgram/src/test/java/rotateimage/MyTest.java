package rotateimage;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.junit.Before;
import org.junit.Test;

public class MyTest {
	Solution s;

	@Before
	public void init() {
		s = new Solution();
	}

	private String print(int[][] src) {
		List<int[]> list = Arrays.asList(src);
		List<String> ret = new ArrayList<String>(list.size());
		for (int[] array : list) {
			List<String> v = new ArrayList<String>(array.length);
			for (int a : array) {
				v.add(String.valueOf(a));
			}
			ret.add("[" + String.join(",", v) + "]");
		}
		return "{" + //
				String.join(",", ret) + "}";
	}

	@Test
	public void test1() {
		int[][] before = new int[0][0];
		int[][] after = new int[0][0];
		s.rotate(before);
		assertEquals(print(after), print(before));
	}

	@Test
	public void test2() {
		int[][] before = new int[][] { new int[] { 0 } };
		int[][] after = new int[][] { new int[] { 0 } };
		s.rotate(before);
		String a = print(after);
		String b = print(before);
		assertEquals(a, b);
	}

	@Test
	public void test3() {
		int[][] before = new int[][] { //
		new int[] { 1, 2 }, new int[] { 1, 2 } };
		int[][] after = new int[][] { //
		new int[] { 1, 1 }, new int[] { 2, 2 } };
		s.rotate(before);
		String a = print(after);
		String b = print(before);
		assertEquals(a, b);
	}

	@Test
	public void test4() {
		int[][] before = new int[][] { //
		new int[] { 1, 2, 3, 4 }, new int[] { 1, 2, 3, 4 }, new int[] { 1, 2, 3, 4 }, new int[] { 1, 2, 3, 4 } };
		int[][] after = new int[][] { //
		new int[] { 1, 1, 1, 1 }, new int[] { 2, 2, 2, 2 }, new int[] { 3, 3, 3, 3 }, new int[] { 4, 4, 4, 4 } };
		s.rotate(before);
		String a = print(after);
		String b = print(before);
		assertEquals(a, b);
	}
}
