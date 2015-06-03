package factorialtrailingzeroes;

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
		assertEquals(0, s.trailingZeroes(1));
		assertEquals(0, s.trailingZeroes(2));
		assertEquals(0, s.trailingZeroes(3));
		assertEquals(0, s.trailingZeroes(4));
		assertEquals(1, s.trailingZeroes(5));
	}

	@Test
	public void test2() {
		// 10! = 3628800
		assertEquals(2, s.trailingZeroes(10));
	}

	@Test
	public void test3() {
		// 15! = 1307674368000
		assertEquals(3, s.trailingZeroes(15));
	}

	@Test
	public void test4() {
		// 20! = 2432902008176640000
		assertEquals(4, s.trailingZeroes(20));
	}
	
	@Test
	public void test5() {
		// 30! = ??
		assertEquals(7, s.trailingZeroes(30));
	}
}
