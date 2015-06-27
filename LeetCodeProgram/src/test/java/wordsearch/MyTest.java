package wordsearch;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class MyTest {
	Solution s;
	char[][] matrix;

	@Before
	public void init() {
		s = new Solution();
		matrix = new char[][] {//
		new char[] { 'a', 'b', 'c' },//
				new char[] { 'd', 'e', 'f' },//
				new char[] { 'g', 'h', 'i' },//
				new char[] { 'j', 'k', 'l' } //
		};
	}

	@Test
	public void test1() {
		assertEquals(true, s.exist(matrix, "a"));
	}

	@Test
	public void test2() {
		assertEquals(true, s.exist(matrix, "abc"));
	}

	@Test
	public void test3() {
		assertEquals(true, s.exist(matrix, "abcfilkjgdeh"));
	}

	@Test
	public void test4() {
		assertEquals(true, s.exist(matrix, "abed"));
		assertEquals(false, s.exist(matrix, "abeda"));
	}

	@Test
	public void test5() {
		assertEquals(true, s.exist(matrix, "efcb"));
		assertEquals(false, s.exist(matrix, "efcbe"));
	}

	@Test
	public void test6() {
		matrix = new char[][] {//
				new char[] { 'a', 'b', 'c', 'e' },//
				new char[] { 's', 'f', 'e', 's' },//
				new char[] { 'a', 'd', 'e', 'e' } };
		assertEquals(true, s.exist(matrix, "abcefsadeese"));
	}

}
