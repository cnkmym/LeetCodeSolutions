package subsets;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
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
		assertEquals("{[]}", print(s.subsets(new int[] {})));
	}

	@Test
	public void test2() {
		assertEquals("{[1],[]}", print(s.subsets(new int[] { 1 })));
	}

	@Test
	public void test3() {
		assertEquals("{[1,2],[1],[2],[]}", print(s.subsets(new int[] { 1, 2 })));
	}

	@Test
	public void test4() {
		assertEquals("{[1,2,3],[1,2],[1,3],[1],[2,3],[2],[3],[]}", print(s.subsets(new int[] { 1, 2, 3 })));
	}
}
