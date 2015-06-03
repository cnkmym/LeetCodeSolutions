package pascaltriangle;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class MyTest2 {
	Solution2 s;
	List<List<Integer>> numbers;

	@Before
	public void init() {
		s = new Solution2();
		numbers = new ArrayList<List<Integer>>();
	}

	private List<Integer> make(int... values) {
		List<Integer> ret = new ArrayList<Integer>(values.length);
		for (int a : values) {
			ret.add(a);
		}
		return ret;
	}

	private String print(List<Integer> values) {
		StringBuilder sb = new StringBuilder();
		for (int i : values) {
			sb.append(i);
			sb.append(",");
		}
		return sb.toString();
	}

	@Test
	public void test0() {
		assertEquals(print(new ArrayList<Integer>()), print(s.getRow(-1)));
	}

	@Test
	public void test1() {
		numbers.add(make(1));
		assertEquals(print(numbers.get(0)), print(s.getRow(0)));
	}

	@Test
	public void test2() {
		numbers.add(make(1));
		numbers.add(make(1, 1));
		assertEquals(print(numbers.get(1)), print(s.getRow(1)));
	}

	@Test
	public void test3() {
		numbers.add(make(1));
		numbers.add(make(1, 1));
		numbers.add(make(1, 2, 1));
		assertEquals(print(numbers.get(2)), print(s.getRow(2)));
	}

	@Test
	public void test4() {
		numbers.add(make(1));
		numbers.add(make(1, 1));
		numbers.add(make(1, 2, 1));
		numbers.add(make(1, 3, 3, 1));
		assertEquals(print(numbers.get(3)), print(s.getRow(3)));
	}

	@Test
	public void test5() {
		numbers.add(make(1));
		numbers.add(make(1, 1));
		numbers.add(make(1, 2, 1));
		numbers.add(make(1, 3, 3, 1));
		numbers.add(make(1, 4, 6, 4, 1));
		assertEquals(print(numbers.get(4)), print(s.getRow(4)));
	}
}
