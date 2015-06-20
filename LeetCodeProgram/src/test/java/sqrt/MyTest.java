package sqrt;

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
		assertEquals(0, s.mySqrt(0));
		assertEquals(1, s.mySqrt(1));
		assertEquals(1, s.mySqrt(2));
		assertEquals(1, s.mySqrt(3));
		assertEquals(2, s.mySqrt(4));
	}

	@Test
	public void test2() {
		assertEquals(2, s.mySqrt(5));
		assertEquals(2, s.mySqrt(6));
		assertEquals(2, s.mySqrt(7));
		assertEquals(2, s.mySqrt(8));
		assertEquals(3, s.mySqrt(9));
	}

	@Test
	public void test3() {
		assertEquals(46340, s.mySqrt(Integer.MAX_VALUE));
	}

	@Test
	public void test4(){
		assertEquals(32, s.mySqrt(1024));
	}
	
	@Test
	public void test5(){
		assertEquals(90, s.mySqrt(8192));
	}
}
