package validsudoku;

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
		char[][] data = new char[][] {//
		new char[] { '5', '3', '.', '.', '7', '.', '.', '.', '.' },//
				new char[] { '6', '.', '.', '1', '9', '5', '.', '.', '.' }, //
				new char[] { '.', '9', '8', '.', '.', '.', '.', '6', '.' }, //
				new char[] { '8', '.', '.', '.', '6', '.', '.', '.', '3' }, //
				new char[] { '4', '.', '.', '8', '.', '3', '.', '.', '1' }, //
				new char[] { '7', '.', '.', '.', '2', '.', '.', '.', '6' }, //
				new char[] { '.', '6', '.', '.', '.', '.', '2', '8', '.' }, //
				new char[] { '.', '.', '.', '4', '1', '9', '.', '.', '5' }, //
				new char[] { '.', '.', '.', '.', '8', '.', '.', '7', '9' } //
		};//

		assertEquals(true, s.isValidSudoku(data));
	}
}
