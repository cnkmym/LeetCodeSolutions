package pascaltriangle;

import java.util.ArrayList;
import java.util.List;

public class Solution {
	public List<List<Integer>> generate(int numRows) {
		List<List<Integer>> numbers = new ArrayList<List<Integer>>();
		if (numRows == 0) {
			return numbers;
		}
		numbers.add(new ArrayList<Integer>() {
			private static final long serialVersionUID = 1L;
			{
				add(1);
			}
		});
		for (int i = 1; i < numRows; i++) {
			// max length of numbers in this row is i
			List<Integer> row = new ArrayList<Integer>();
			List<Integer> lastRow = numbers.get(i - 1);
			row.add(1);// first element
			for (int j = 1; j <= i; j++) {
				// number j = 1 // first
				// (last line) number[j-1] + (number[j] || 0)
				row.add(lastRow.get(j - 1) + (j == i ? 0 : lastRow.get(j)));
			}
			numbers.add(row);
		}
		return numbers;
	}
}
