package permutationsequence;

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
	public void test0() {
		assertEquals("123", s.getPermutation(3, 0));
	}

	@Test
	public void test1() {
		assertEquals("123", s.getPermutation(3, 1));
	}

	@Test
	public void test2() {
		assertEquals("132", s.getPermutation(3, 2));
	}

	@Test
	public void test3() {
		assertEquals("213", s.getPermutation(3, 3));
	}

	@Test
	public void test4() {
		assertEquals("231", s.getPermutation(3, 4));
	}

	@Test
	public void test5() {
		assertEquals("312", s.getPermutation(3, 5));
	}

	@Test
	public void test6() {
		assertEquals("321", s.getPermutation(3, 6));
	}

	@Test
	public void test7() {
		assertEquals("123", s.getPermutation(3, 7));
	}
}
