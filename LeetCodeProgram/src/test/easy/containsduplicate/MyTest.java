package containsduplicate;

import static org.junit.Assert.*;

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
		assertEquals(false, s.containsDuplicate(null));
		assertEquals(false, s.containsDuplicate(new int[0]));
	}

	@Test
	public void test2() {
		assertEquals(false, s.containsDuplicate(new int[] { 1 }));
	}

	@Test
	public void test3() {
		assertEquals(false, s.containsDuplicate(new int[] { 1, 2, 3, 4, 5 }));
	}

	@Test
	public void test4() {
		assertEquals(true, s.containsDuplicate(new int[] { 1, -1, 0, -1 }));
	}
}
