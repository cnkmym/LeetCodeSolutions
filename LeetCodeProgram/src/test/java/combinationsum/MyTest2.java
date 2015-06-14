package combinationsum;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
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

	private String print(List<List<Integer>> src) {
		List<String> ret = new LinkedList<String>();
		for (List<Integer> list : src) {
			ret.add("[" + String.join(",", //
					list.stream()//
							.map(i -> String.valueOf(i))//
							.collect(Collectors.toList()))//
					+ "]");
		}
		Collections.sort(ret);
		return "{" + String.join(",", ret) + "}";
	}

	@Test
	public void test1() {
		int[] src = new int[] {};
		assertEquals("{}", print(s.combinationSum2(src, 0)));
	}

	@Test
	public void test2() {
		int[] src = new int[] { 1 };
		assertEquals("{}", print(s.combinationSum2(src, 2)));
		src = new int[] { 1, 1 };
		assertEquals("{[1,1]}", print(s.combinationSum2(src, 2)));
		src = new int[] { 1, 1 };
		assertEquals("{[1]}", print(s.combinationSum2(src, 1)));
	}

	@Test
	public void test3() {
		int[] src = new int[] { 2, 3, 6, 7 };
		assertEquals("{[7]}", print(s.combinationSum2(src, 7)));
		src = new int[] { 2, 3, 2, 6, 7 };
		assertEquals("{[2,2,3],[7]}", print(s.combinationSum2(src, 7)));
	}

	@Test
	public void test4() {
		int[] src = new int[] { 7, 1, 2, 6, 3 };
		assertEquals("{[1,6],[7]}", print(s.combinationSum2(src, 7)));
		src = new int[] { 7, 1, 2, 7, 3, 6, 3 };
		assertEquals("{[1,3,3],[1,6],[7]}", print(s.combinationSum2(src, 7)));
	}
}
