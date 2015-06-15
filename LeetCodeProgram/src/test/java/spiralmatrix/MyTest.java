package spiralmatrix;

import static org.junit.Assert.*;

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

	private String print(List<Integer> nodes) {
		return "[" + String.join(",", //
				nodes.stream().map(i -> String.valueOf(i)).collect(Collectors.toList())) + "]";
	}

	@Test
	public void test1() {
		assertEquals("[]", print(s.spiralOrder(null)));
	}

	@Test
	public void test2() {
		assertEquals("[1]", print(s.spiralOrder(new int[][] { new int[] { 1 } })));
	}

	@Test
	public void test3() {
		assertEquals("[1,2,3,4]", print(s.spiralOrder(new int[][] { //
				new int[] { 1, 2 }, new int[] { 4, 3 } })));
	}

	@Test
	public void test4() {
		assertEquals("[1,2,3,4,5,6,7,8,9]", print(s.spiralOrder(new int[][] { //
				new int[] { 1, 2, 3 }, //
						new int[] { 8, 9, 4 },//
						new int[] { 7, 6, 5 } })));
	}

	@Test
	public void test5() {
		assertEquals("[1,2]", print(s.spiralOrder(new int[][] { new int[] { 1, 2 } })));
	}

	@Test
	public void test6() {
		assertEquals("[1,2]", print(s.spiralOrder(new int[][] { new int[] { 1 }, new int[] { 2 } })));
	}

	@Test
	public void test7() {
		assertEquals("[1,2,3,4,5,6]",
				print(s.spiralOrder(new int[][] { new int[] { 1, 2, 3 }, new int[] { 6, 5, 4 } })));
	}

}
