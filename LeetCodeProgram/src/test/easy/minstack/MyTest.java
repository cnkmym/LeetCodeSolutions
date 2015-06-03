package minstack;

import static org.junit.Assert.assertEquals;

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
		s.push(1);
		assertEquals(1, s.top());
		assertEquals(1, s.getMin());
		s.push(2);
		assertEquals(2, s.top());
		assertEquals(1, s.getMin());
	}

	@Test
	public void test2() {
		s.push(2);
		s.push(1);
		assertEquals(1, s.top());
		assertEquals(1, s.getMin());
		s.pop();
		assertEquals(2, s.top());
		assertEquals(2, s.getMin());
		s.push(0);
		assertEquals(0, s.top());
		assertEquals(0, s.getMin());
		s.pop();
		assertEquals(2, s.getMin());
	}
}
