package threesum;

import static org.junit.Assert.*;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.junit.Before;
import org.junit.Test;

public class MyTest {
	Solution s;

	@Before
	public void init() {
		s = new Solution();
	}

	private String print(List<Integer> list) {
		StringBuilder sb = new StringBuilder();
		for (Integer i : list) {
			sb.append(i);
			sb.append(",");
		}
		return sb.toString();
	}

	private Set<String> print2(List<List<Integer>> lists) {
		Set<String> ret = new HashSet<String>();
		for (List<Integer> list : lists) {
			ret.add(print(list));
		}
		return ret;
	}

	@Test
	public void test0() {
		int[] nums = new int[] { -1, 0, 0, 0, 0, 0 };
		Set<String> exp = new HashSet<String>();
		exp.add("0,0,0,");
		assertArrayEquals(exp.toArray(), print2(s.threeSum(nums)).toArray());
	}

	@Test
	public void test00() {
		int[] nums = new int[] { 0, 0 };
		Set<String> exp = new HashSet<String>();
		assertArrayEquals(exp.toArray(), print2(s.threeSum(nums)).toArray());
	}

	@Test
	public void test000() {
		int[] nums = new int[] { 0, 0, 0 };
		Set<String> exp = new HashSet<String>();
		exp.add("0,0,0,");
		assertArrayEquals(exp.toArray(), print2(s.threeSum(nums)).toArray());
	}

	@Test
	public void test0001() {
		int[] nums = new int[] { 0, 0, 0, 1 };
		Set<String> exp = new HashSet<String>();
		exp.add("0,0,0,");
		assertArrayEquals(exp.toArray(), print2(s.threeSum(nums)).toArray());
	}

	@Test
	public void test1() {
		int[] nums = new int[] { -1, 0, 1, 2, -1, -4 };
		Set<String> exp = new HashSet<String>();
		exp.add("-1,0,1,");
		exp.add("-1,-1,2,");
		assertArrayEquals(exp.toArray(), print2(s.threeSum(nums)).toArray());
	}

	@Test
	public void test2() {
		int[] nums = new int[] { -2, 0, 0, 2, 2 };
		Set<String> exp = new HashSet<String>();
		exp.add("-2,0,2,");
		assertArrayEquals(exp.toArray(), print2(s.threeSum(nums)).toArray());
	}
}
