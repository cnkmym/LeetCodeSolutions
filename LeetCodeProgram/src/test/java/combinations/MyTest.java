package combinations;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Collections;
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

	private String print(List<List<Integer>> value) {
		List<String> ret = new ArrayList<String>();
		for (List<Integer> list : value) {
			String s = "[" + String.join(",", list.stream().map(i -> String.valueOf(i)).collect(Collectors.toList()))
					+ "]";
			ret.add(s);
		}

		Collections.sort(ret);
		return "{" + String.join(",", ret) + "}";
	}

	@Test
	public void test1() {
		List<String> exp = new ArrayList<String>();
		assertEquals("{" + String.join(",", exp) + "}", print(s.combine(1, 2)));
	}

	@Test
	public void test2() {
		List<String> exp = new ArrayList<String>();
		exp.add("[1,2]");

		assertEquals("{" + String.join(",", exp) + "}", print(s.combine(2, 2)));
	}

	@Test
	public void test3() {
		List<String> exp = new ArrayList<String>();
		exp.add("[1]");
		exp.add("[2]");
		exp.add("[3]");

		assertEquals("{" + String.join(",", exp) + "}", print(s.combine(3, 1)));
	}

	@Test
	public void test4() {
		List<String> exp = new ArrayList<String>();
		exp.add("[1,2]");
		exp.add("[1,3]");
		exp.add("[2,3]");

		assertEquals("{" + String.join(",", exp) + "}", print(s.combine(3, 2)));
	}

	@Test
	public void test5() {
		List<String> exp = new ArrayList<String>();
		exp.add("[1,2]");
		exp.add("[1,3]");
		exp.add("[1,4]");
		exp.add("[2,3]");
		exp.add("[2,4]");
		exp.add("[3,4]");

		assertEquals("{" + String.join(",", exp) + "}", print(s.combine(4, 2)));
	}
}
