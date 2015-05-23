package zigzeg;

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
		assertEquals("", s.convert("", 2));
		assertEquals("123456", s.convert("123456", 1));
	}

	@Test
	public void test2() {
		assertEquals("PAHNAPLSIIGYIR", s.convert("PAYPALISHIRING", 3));
	}
}
