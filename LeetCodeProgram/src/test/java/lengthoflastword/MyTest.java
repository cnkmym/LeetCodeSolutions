package lengthoflastword;

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
		assertEquals(0, s.lengthOfLastWord(null));
		assertEquals(0, s.lengthOfLastWord(""));
		assertEquals(0, s.lengthOfLastWord("          "));
	}
	
	@Test
	public void test2() {
		assertEquals(5, s.lengthOfLastWord("Hello World"));
	}
	
	@Test
	public void test3() {
		assertEquals(5, s.lengthOfLastWord("Hello"));
	}
	
	@Test
	public void test4() {
		assertEquals(5, s.lengthOfLastWord("      Hello"));
	}
	
	@Test
	public void test5() {
		assertEquals(5, s.lengthOfLastWord("      Hello     "));
	}
}
