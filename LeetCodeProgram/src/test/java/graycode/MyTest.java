package graycode;

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

	private String print(List<Integer> list) {
		return "[" + String.join(",", list.stream().map(i -> String.valueOf(i)).collect(Collectors.toList())) + "]";
	}

	@Test
	public void test1() {
		assertEquals("[0]", print(s.grayCode(0)));
	}

	@Test
	public void test2() {
		assertEquals("[0,1]", print(s.grayCode(1)));
	}

	@Test
	public void test3() {
		assertEquals("[0,1,3,2]", print(s.grayCode(2)));
	}

	@Test
	public void test4() {
		assertEquals("[0,1,3,2,6,7,5,4]", print(s.grayCode(3)));
	}

	@Test
	public void test5() {
		assertEquals("[0,1,3,2,6,7,5,4,12,13,15,14,10,11,9,8]", print(s.grayCode(4)));
	}
}
