package numberof1bits;

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
		assertEquals(1, s.hammingWeight(1));
	}

	@Test
	public void test2() {
		assertEquals(1, s.hammingWeight(2));
	}

	@Test
	public void test7() {
		assertEquals(3, s.hammingWeight(7));
	}

	@Test
	public void test11() {
		assertEquals(3, s.hammingWeight(11));
	}

	@Test
	public void test16() {
		assertEquals(1, s.hammingWeight(16));
	}

	@Test
	public void test2147483648() {
		assertEquals(1, s.hammingWeight(Integer.parseUnsignedInt("2147483648")));
	}
	
	@Test
	public void test4294967295() {
		assertEquals(32, s.hammingWeight(Integer.parseUnsignedInt("4294967295")));
	}

}
