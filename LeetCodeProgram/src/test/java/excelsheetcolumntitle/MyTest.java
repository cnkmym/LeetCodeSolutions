package excelsheetcolumntitle;

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
		assertEquals("A", s.convertToTitle(1));
	}

	@Test
	public void test2() {
		assertEquals("B", s.convertToTitle(2));
	}

	@Test
	public void test3() {
		assertEquals("C", s.convertToTitle(3));
	}

	@Test
	public void test26() {
		assertEquals("Z", s.convertToTitle(26));
	}

	@Test
	public void test27() {
		assertEquals("AA", s.convertToTitle(27));
	}

	@Test
	public void test28() {
		assertEquals("AB", s.convertToTitle(28));
	}

	@Test
	public void test52() {
		assertEquals("AZ", s.convertToTitle(52));
	}
}
