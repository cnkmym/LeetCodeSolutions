package spiralmatrix;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class MyTest2 {
	Solution2 s;

	@Before
	public void init() {
		s = new Solution2();
	}

	private String print(int[][] matrix) {
		StringBuilder sb = new StringBuilder();
		sb.append("{");
		for (int i = 0; i < matrix.length; i++) {
			sb.append("[");
			List<String> list = new ArrayList<String>();
			for (int j = 0; j < matrix[i].length; j++) {
				list.add(String.valueOf(matrix[i][j]));
			}
			sb.append(String.join(",", list));
			sb.append("]");
		}
		sb.append("}");
		return sb.toString();
	}

	@Test
	public void test1() {
		assertEquals("{}", print(s.generateMatrix(0)));
	}

	@Test
	public void test2() {
		assertEquals("{[1]}", print(s.generateMatrix(1)));
	}

	@Test
	public void test3() {
		assertEquals("{[1,2][4,3]}", print(s.generateMatrix(2)));
	}

	@Test
	public void test4() {
		assertEquals("{[1,2,3][8,9,4][7,6,5]}", print(s.generateMatrix(3)));
	}

}
