package summaryranges;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class MyTest {
	Solution s;

	@Before
	public void init() {
		s = new Solution();
	}

	private String print(List<String> list) {
		return "[" + String.join(",", list) + "]";
	}

	@Test
	public void test1() {
		int[] data = new int[0];
		assertEquals("[]", print(s.summaryRanges(data)));
	}

	@Test
	public void test2() {
		int[] data = new int[] { 1, 2, 3, 4 };
		assertEquals("[1->4]", print(s.summaryRanges(data)));
	}

	@Test
	public void test3() {
		int[] data = new int[] { 1 };
		assertEquals("[1]", print(s.summaryRanges(data)));
	}

	@Test
	public void test4() {
		int[] data = new int[] { 1, 3 };
		assertEquals("[1,3]", print(s.summaryRanges(data)));
	}

	@Test
	public void test5() {
		int[] data = new int[] { 1, 2, 3, 5, 6, 7, 9, 10 };
		assertEquals("[1->3,5->7,9->10]", print(s.summaryRanges(data)));
	}
}
