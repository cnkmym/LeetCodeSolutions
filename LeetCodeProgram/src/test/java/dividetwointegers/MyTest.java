package dividetwointegers;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class MyTest {
	Solution2 s;
//	Solution s;

	@Before
	public void init() {
		s = new Solution2();
//		s = new Solution();
	}

	@Test
	public void tes1() {
		assertEquals(Integer.MAX_VALUE, s.divide(3, 0));
	}

	@Test
	public void tes2() {
		assertEquals(Integer.MAX_VALUE, s.divide(Integer.MIN_VALUE, -1));
	}

	@Test
	public void tes3() {
		assertEquals(Integer.MIN_VALUE + 1, s.divide(Integer.MAX_VALUE, -1));
	}

	@Test
	public void tes4() {
		assertEquals(Integer.MIN_VALUE, s.divide(Integer.MIN_VALUE, 1));
	}

	@Test
	public void tes5() {
		assertEquals(1, s.divide(1, 1));
	}

	@Test
	public void tes6() {
		assertEquals(6, s.divide(6, 1));
	}

	@Test
	public void tes7() {
		assertEquals(27, s.divide(81, 3));
	}
	
	@Test
	public void tes8() {
		assertEquals(27, s.divide(82, 3));
	}
	
	@Test
	public void tes9() {
		assertEquals(0, s.divide(2, 3));
	}
	
	@Test
	public void tes10() {
		assertEquals(-27, s.divide(81, -3));
	}
	
	@Test
	public void tes11() {
		assertEquals(27, s.divide(-81, -3));
	}
	
	@Test
	public void tes12() {
		assertEquals(0, s.divide(-999511578, -2147483648));
	}
	
	@Test
	public void tes13() {
		assertEquals(12, s.divide(-1021989372, -82778243));
	}
}
