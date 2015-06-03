package houserobber;

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
		int[] nums = new int[]{1,1,1,1};
		int exp = 2;
		assertEquals(exp,s.rob(nums));
	}
	
	@Test
	public void test2(){
		int[] nums = new int[]{1,2,3,4};
		int exp = 6;
		assertEquals(exp,s.rob(nums));
	}
	
	@Test
	public void test3(){
		int[] nums = new int[]{1,0,0,1};
		int exp = 2;
		assertEquals(exp,s.rob(nums));
	}
	
	@Test
	public void test4(){
		int[] nums = new int[]{0,1,0,0,3};
		int exp = 4;
		assertEquals(exp,s.rob(nums));
	}
}
