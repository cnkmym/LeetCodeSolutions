package permutations;

import static org.junit.Assert.*;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

import org.junit.Before;
import org.junit.Test;

public class MyTest {
	Solution s;

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

	@Before
	public void init() {
		s = new Solution();
	}

	@Test
	public void test1() {
		int[] src = new int[] {};
		assertEquals("{}", print(s.permute(src)));
	}

	@Test
	public void test2() {
		int[] src = new int[] { 1 };
		assertEquals("{[1]}", print(s.permute(src)));
	}

	@Test
	public void test3() {
		int[] src = new int[] { 1, 1, 1 };
		assertEquals("{[1,1,1]}", print(s.permute(src)));
	}

	@Test
	public void test4() {
		int[] src = new int[] { 1, 1, 2 };
		assertEquals("{[1,1,2],[1,2,1],[2,1,1]}", print(s.permute(src)));
	}

	@Test
	public void test5() {
		int[] src = new int[] { 1, 2, 3 };
		assertEquals("{[1,2,3],[1,3,2],[2,1,3],[2,3,1],[3,1,2],[3,2,1]}", print(s.permute(src)));
	}

	@Test
	public void test6() {
		int[] src = new int[] { 0, -1, 1 };
		assertEquals("{[-1,0,1],[-1,1,0],[0,-1,1],[0,1,-1],[1,-1,0],[1,0,-1]}", print(s.permute(src)));
	}
}
