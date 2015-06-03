package countandsay;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class MyTest {
	Solution s;
	@Before
	public void init(){
		s = new Solution();
	}
	
	@Test
	public void test1(){
		assertEquals("1",s.countAndSay(1));
	}
	
	@Test
	public void test2(){
		assertEquals("11",s.countAndSay(2));
	}
	
	@Test
	public void test3(){
		assertEquals("21",s.countAndSay(3));
	}
	
	@Test
	public void test4(){
		assertEquals("1211",s.countAndSay(4));
	}
	
	@Test
	public void test5(){
		assertEquals("111221",s.countAndSay(5));
	}
}
