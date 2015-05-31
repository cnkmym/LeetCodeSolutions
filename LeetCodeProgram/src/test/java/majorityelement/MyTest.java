package majorityelement;

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
		assertEquals(0, s.majorityElement(new int[] { 0 }));
	}

	@Test
	public void test2() {
		assertEquals(0, s.majorityElement(new int[] { 0, 0, 0, 0, 0 }));
	}

	@Test
	public void test21() {
		assertEquals(2, s.majorityElement(new int[] { 1, 1, 2, 2, 2 }));
	}
	
	@Test
	public void test22() {
		assertEquals(2, s.majorityElement(new int[] { 2, 1, 2, 1, 2 }));
	}

	@Test
	public void test3() {
		assertEquals(1, s.majorityElement(new int[] { 2, 1, 0, 1, 1 }));
	}

	@Test
	public void test4() {
		assertEquals(1, s.majorityElement(new int[] { 1, 1, 1, 1, 0, 0, 0, 0, 0, 1, 1 }));
	}
}
