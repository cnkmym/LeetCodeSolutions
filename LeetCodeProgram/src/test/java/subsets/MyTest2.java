package subsets;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import org.junit.Before;
import org.junit.Test;

public class MyTest2 {
	Solution2 s;

	@Before
	public void init() {
		s = new Solution2();
	}

	private String print(List<List<Integer>> values) {
		List<String> strs = new ArrayList<String>(values.size());
		for (List<Integer> list : values) {
			strs.add("[" + String.join(",", list.stream().map(i -> String.valueOf(i)).collect(Collectors.toList()))//
					+ "]");
		}
		Collections.sort(strs);
		return "{" + String.join(",", strs) + "}";
	}

	@Test
	public void test1() {
		assertEquals("{[]}", print(s.subsetsWithDup(new int[] {})));
	}

	@Test
	public void test2() {
		assertEquals("{[1],[]}", print(s.subsetsWithDup(new int[] { 1 })));
	}

	@Test
	public void test3() {
		assertEquals("{[1,2],[1],[2],[]}", print(s.subsetsWithDup(new int[] { 1, 2 })));
	}

	@Test
	public void test4() {
		assertEquals("{[1,2,3],[1,2],[1,3],[1],[2,3],[2],[3],[]}", print(s.subsetsWithDup(new int[] { 1, 2, 3 })));
	}

	@Test
	public void test5() {
		assertEquals("{[1,1,1],[1,1],[1],[]}", print(s.subsetsWithDup(new int[] { 1, 1, 1 })));
	}

	@Test
	public void test6() {
		assertEquals("{[1,1,2],[1,1],[1,2],[1],[2],[]}", print(s.subsetsWithDup(new int[] { 1, 1, 2 })));
	}

	@Test
	public void test7() {
		assertEquals(
				"{[1,1,2,2,3],[1,1,2,2],[1,1,2,3],[1,1,2],[1,1,3],[1,1],[1,2,2,3],[1,2,2],[1,2,3],[1,2],[1,3],[1],[2,2,3],[2,2],[2,3],[2],[3],[]}",
				print(s.subsetsWithDup(new int[] { 1, 1, 2, 2, 3 })));
	}
}
