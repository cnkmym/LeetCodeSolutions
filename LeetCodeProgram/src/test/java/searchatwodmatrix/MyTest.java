package searchatwodmatrix;

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
		int[][] matrix = new int[][] { //
		new int[] { 0, 1, 2 }, //
				new int[] { 3, 4, 5 } //
		};

		assertEquals(true, s.searchMatrix(matrix, 0));
		assertEquals(true, s.searchMatrix(matrix, 1));
		assertEquals(true, s.searchMatrix(matrix, 3));
		assertEquals(true, s.searchMatrix(matrix, 4));
		assertEquals(false, s.searchMatrix(matrix, 6));
	}

	@Test
	public void test2() {
		int[][] matrix = new int[][] { //
		new int[] { 0 }, //
				new int[] { 1 } //
		};

		assertEquals(true, s.searchMatrix(matrix, 1));
		assertEquals(false, s.searchMatrix(matrix, 2));
	}

	@Test
	public void test3() {
		int[][] matrix = new int[][] { //
		new int[] { 0, 1 } };

		assertEquals(true, s.searchMatrix(matrix, 1));
		assertEquals(false, s.searchMatrix(matrix, 2));
	}
	
	@Test
	public void test4() {
		int[][] matrix = new int[][] {
				new int[] { 0, 1 },//
				new int[] { 2, 3 },//
				new int[] { 4, 5 },//
				new int[] { 6, 7 },//
				new int[] { 8, 9 }//
		};
		assertEquals(true, s.searchMatrix(matrix, 1));
		assertEquals(true, s.searchMatrix(matrix, 2));
		assertEquals(true, s.searchMatrix(matrix, 5));
		assertEquals(true, s.searchMatrix(matrix, 6));
		
	}
}
