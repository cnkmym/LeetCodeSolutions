package setmatrixzeros;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Before;
import org.junit.Test;

public class MyTest {
	Solution s;

	@Before
	public void init() {
		s = new Solution();
	}

	private String print(int[][] matrix) {
		StringBuilder sb = new StringBuilder();
		sb.append("{");
		for (int i = 0; i < matrix.length; i++) {
			sb.append("[");
			for (int j = 0; j < matrix[i].length; j++) {
				sb.append(matrix[i][j]);
				sb.append(",");
			}
			sb.append("]");
		}
		sb.append("}");
		return sb.toString();
	}

	@Test
	public void test1() {
		int[][] matrix = new int[][] { //
		new int[] { 1, 1, 1, 1 },//
				new int[] { 1, 1, 1, 1 },//
				new int[] { 1, 1, 1, 1 } //
		};

		int[][] exp = new int[][] { //
		new int[] { 1, 1, 1, 1 },//
				new int[] { 1, 1, 1, 1 },//
				new int[] { 1, 1, 1, 1 } //
		};

		s.setZeroes(matrix);

		assertEquals(print(exp), print(matrix));
	}

	@Test
	public void test2() {
		int[][] matrix = new int[][] { //
		new int[] { 1, 1, 1, 1 },//
				new int[] { 1, 1, 1, 1 },//
				new int[] { 1, 1, 1, 0 } //
		};

		int[][] exp = new int[][] { //
		new int[] { 1, 1, 1, 0 },//
				new int[] { 1, 1, 1, 0 },//
				new int[] { 0, 0, 0, 0 } //
		};

		s.setZeroes(matrix);

		assertEquals(print(exp), print(matrix));
	}

	@Test
	public void test3() {
		int[][] matrix = new int[][] { //
		new int[] { 1, 0 },//
		};

		int[][] exp = new int[][] { //
		new int[] { 0, 0 },//
		};

		s.setZeroes(matrix);

		assertEquals(print(exp), print(matrix));
	}

	@Test
	public void test4() {
		int[][] matrix = new int[][] { //
		new int[] { 1 },//
				new int[] { 0 } //
		};

		int[][] exp = new int[][] { //
		new int[] { 0 },//
				new int[] { 0 } //
		};

		s.setZeroes(matrix);

		assertEquals(print(exp), print(matrix));
	}
}
