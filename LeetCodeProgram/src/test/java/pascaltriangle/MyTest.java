package pascaltriangle;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class MyTest {
	Solution s;
	List<List<Integer>> numbers;

	@Before
	public void init() {
		s = new Solution();
		numbers = new ArrayList<List<Integer>>();
	}

	private List<Integer> make(int... values) {
		List<Integer> ret = new ArrayList<Integer>(values.length);
		for (int a : values) {
			ret.add(a);
		}
		return ret;
	}

	private String print(List<List<Integer>> values) {
		StringBuilder sb = new StringBuilder();
		sb.append("{");
		for (List<Integer> v : values) {
			sb.append("[");
			for (int i : v) {
				sb.append(i);
				sb.append(",");
			}
			sb.append("],");
		}
		sb.append("}");
		return sb.toString();
	}

	@Test
	public void test0() {
		assertEquals(print(numbers), print(s.generate(0)));
	}

	@Test
	public void test1() {
		numbers.add(make(1));
		assertEquals(print(numbers), print(s.generate(1)));
	}

	@Test
	public void test2() {
		numbers.add(make(1));
		numbers.add(make(1, 1));
		assertEquals(print(numbers), print(s.generate(2)));
	}

	@Test
	public void test3() {
		numbers.add(make(1));
		numbers.add(make(1, 1));
		numbers.add(make(1, 2, 1));
		assertEquals(print(numbers), print(s.generate(3)));
	}

	@Test
	public void test4() {
		numbers.add(make(1));
		numbers.add(make(1, 1));
		numbers.add(make(1, 2, 1));
		numbers.add(make(1, 3, 3, 1));
		assertEquals(print(numbers), print(s.generate(4)));
	}

	@Test
	public void test5() {
		numbers.add(make(1));
		numbers.add(make(1, 1));
		numbers.add(make(1, 2, 1));
		numbers.add(make(1, 3, 3, 1));
		numbers.add(make(1, 4, 6, 4, 1));
		assertEquals(print(numbers), print(s.generate(5)));
	}
}
