package anagrams;

import static org.junit.Assert.*;

import java.util.Comparator;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class MyTest {
	Solution s;

	@Before
	public void init() {
		s = new Solution();
	}

	private String print(List<String> strs) {
		strs.sort(new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				return o1.compareTo(o2);
			}
		});
		return "[" + String.join(",", strs) + "]";
	}

	@Test
	public void test0() {
		assertEquals("[]", print(s.anagrams(new String[] { "a", "b", "abc", "acdb" })));
	}

	@Test
	public void test1() {
		assertEquals("[abc,acb]", print(s.anagrams(new String[] { "a", "b", "abc", "acb" })));
	}

	@Test
	public void test2() {
		assertEquals("[ab,abc,acb,ba]", print(s.anagrams(new String[] { "aa", "ba", "abc", "acb", "ab" })));
	}

}
