package uniquebinarysearchtree;

import static org.junit.Assert.assertEquals;

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
		assertEquals(1, s.numTrees(1));
	}

	@Test
	public void test2() {
		assertEquals(2, s.numTrees(2));
	}

	@Test
	public void test3() {
		assertEquals(5, s.numTrees(3));
	}
}
