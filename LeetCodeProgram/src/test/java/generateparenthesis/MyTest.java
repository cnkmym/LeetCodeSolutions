package generateparenthesis;

import static org.junit.Assert.assertArrayEquals;

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

	private String[] sortAndConvert(List<String> list) {
		list.sort(new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				return o1.compareTo(o2);
			}
		});
		return list.toArray(new String[list.size()]);
	}

	@Test
	public void test1() {
		assertArrayEquals(new String[0], sortAndConvert(s.generateParenthesis(0)));
	}

	@Test
	public void test2() {
		assertArrayEquals(new String[] { "()" }, sortAndConvert(s.generateParenthesis(1)));
	}

	@Test
	public void test3() {
		assertArrayEquals(new String[] { "(())", "()()" }, sortAndConvert(s.generateParenthesis(2)));
	}

	@Test
	public void test4() {
		assertArrayEquals(new String[] { "((()))", "(()())", "(())()", "()(())", "()()()" },
				sortAndConvert(s.generateParenthesis(3)));
	}
}
