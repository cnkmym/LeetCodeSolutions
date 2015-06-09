package rectanglearea;

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
		// horizontal non intersection
		assertEquals(0, s.computeArea(0, 0, 1, 1, 2, 0, 3, 1));

		// vertical non intersection
		assertEquals(0, s.computeArea(0, 0, 1, 1, 0, 2, 1, 3));

		// special rectangle
		assertEquals(0, s.computeArea(0, 0, 0, 1, 0, 4, 3, 5));
		assertEquals(0, s.computeArea(0, 0, 3, 5, 2, 2, 2, 5));
	}

	@Test
	public void test2() {
		assertEquals(6, s.computeArea(-3, 0, 3, 4, 0, -1, 9, 2));
	}

	@Test
	public void test3() {
		assertEquals(1, s.computeArea(1, 1, 2, 2, 0, 0, 3, 3));
		assertEquals(1, s.computeArea(0, 0, 3, 3, 1, 1, 2, 2));
	}

	@Test
	public void test4() {
		assertEquals(9, s.computeArea(0, 0, 4, 4, 1, 1, 5, 4));
	}
	
	@Test
	public void test5() {
		assertEquals(6, s.computeArea(0, 0, 4, 4, 1, 1, 5, 3));
	}

}
