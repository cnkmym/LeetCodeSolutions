package parlidromenumber;

import static org.junit.Assert.*;

import org.junit.Test;

public class MyTest {
	Solution s = new Solution();
	
	@Test
	public void test1(){
		assertEquals(true,s.isPalindrome(0));
		assertEquals(true,s.isPalindrome(1));
		assertEquals(false,s.isPalindrome(-1));
	}
	
	@Test
	public void test2(){
		assertEquals(true,s.isPalindrome(1234321));
	}
	
	@Test
	public void test3(){
		assertEquals(true,s.isPalindrome(12344321));
	}
}
