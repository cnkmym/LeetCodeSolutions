package simplifypath;

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
		String input = "";
		assertEquals("/", s.simplifyPath(input));
	}
	
	@Test
	public void test2() {
		String input = "//";
		assertEquals("/", s.simplifyPath(input));
	}
	
	@Test
	public void test3() {
		String input = "../../";
		assertEquals("/", s.simplifyPath(input));
	}
	
	@Test
	public void test4() {
		String input = "/usr//yemao/";
		assertEquals("/usr/yemao", s.simplifyPath(input));
	}
	
	@Test
	public void test5() {
		String input = "./.././../usr///./yemao//./";
		assertEquals("/usr/yemao", s.simplifyPath(input));
	}
	
	@Test
	public void test6() {
		String input = "/usr/yemao/../rabit//";
		assertEquals("/usr/rabit", s.simplifyPath(input));
	}
	
	@Test
	public void test7() {
		String input = "./usr/../../usr///////yemao/./././//abc/////";
		assertEquals("/usr/yemao/abc", s.simplifyPath(input));
	}
}
