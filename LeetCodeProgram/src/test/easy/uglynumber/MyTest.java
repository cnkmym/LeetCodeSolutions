package uglynumber;

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
		assertEquals(true,s.isUgly(1));
		assertEquals(true,s.isUgly(2));
		assertEquals(true,s.isUgly(3));
		assertEquals(true,s.isUgly(4));
		assertEquals(true,s.isUgly(5));
		assertEquals(true,s.isUgly(6));
		assertEquals(false,s.isUgly(7));
		assertEquals(true,s.isUgly(8));
		assertEquals(true,s.isUgly(9));
		assertEquals(true,s.isUgly(10));
	}
}
