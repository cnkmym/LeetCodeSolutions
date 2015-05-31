package excelsheetcolumnnumber;

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
		assertEquals(1, s.titleToNumber("A"));
	}

	@Test
	public void test2() {
		assertEquals(2, s.titleToNumber("B"));
	}

	@Test
	public void test26() {
		assertEquals(26, s.titleToNumber("Z"));
	}

	@Test
	public void test27() {
		assertEquals(27, s.titleToNumber("AA"));
	}
}
