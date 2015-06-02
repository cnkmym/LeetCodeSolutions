package countprimes;

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
		assertEquals(0, s.countPrimes(2));
	}

	@Test
	public void test2() {
		// prime : 2,3,5,7,11,13,17,19
		assertEquals(0, s.countPrimes(2));
		assertEquals(1, s.countPrimes(3));
		assertEquals(2, s.countPrimes(5));
		assertEquals(3, s.countPrimes(7));
		assertEquals(4, s.countPrimes(11));
		assertEquals(5, s.countPrimes(13));
		assertEquals(6, s.countPrimes(17));
		assertEquals(7, s.countPrimes(19));
		assertEquals(8, s.countPrimes(20));
	}

	@Test
	public void test3() {
		// prime : 2,3,5,7,11,13,17,19
		assertEquals(4, s.countPrimes(10));
		assertEquals(8, s.countPrimes(20));
	}
}
