package containsduplicate;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class MyTest2 {
	Solution2 s;

	@Before
	public void init() {
		s = new Solution2();
	}

	@Test
	public void test1() {
		assertEquals(false, s.containsNearbyDuplicate(null, 0));
		assertEquals(false, s.containsNearbyDuplicate(new int[0], 0));
	}

	@Test
	public void test2() {
		assertEquals(false, s.containsNearbyDuplicate(new int[] { 1 }, 0));
	}

	@Test
	public void test3() {
		assertEquals(false, s.containsNearbyDuplicate(new int[] { 1, 2, 3, 4, 5 }, 1));
	}

	@Test
	public void test4() {
		assertEquals(true, s.containsNearbyDuplicate(new int[] { 1, -1, 0, -1 }, 2));
		assertEquals(false, s.containsNearbyDuplicate(new int[] { 1, -1, 0, -1 }, 1));
	}
}
