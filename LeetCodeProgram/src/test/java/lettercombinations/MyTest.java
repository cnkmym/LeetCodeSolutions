package lettercombinations;

import static org.junit.Assert.assertArrayEquals;

import java.util.Collections;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class MyTest {
	Solution s;

	@Before
	public void init() {
		s = new Solution();
	}

	@Test
	public void test1() {
		assertArrayEquals(new String[0], s.letterCombinations(null).toArray());
		assertArrayEquals(new String[0], s.letterCombinations("").toArray());
	}

	@Test
	public void test2() {
		List<String> ret = s.letterCombinations("23");
		Collections.sort(ret);
		assertArrayEquals(new String[] { "ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf" }, ret.toArray());
	}
}
