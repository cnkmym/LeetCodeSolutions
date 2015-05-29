package pascaltriangle;

import java.util.ArrayList;
import java.util.List;

public class Solution2 {
	List<Integer> numbers;

	public List<Integer> getRow(int rowIndex) {
		numbers = new ArrayList<Integer>();
		if (rowIndex < 0) {
			return numbers;
		}
		numbers.add(1);
		int tmp1 = 1;
		int tmp2 = 0;
		for (int i = 1; i <= rowIndex; i++) {
			tmp1 = 1;
			for (int j = 1; j <= i; j++) {
				tmp2 = (j == i ? 0 : numbers.get(j));
				int result = tmp1 + tmp2;
				tmp1 = tmp2;
				if (numbers.size() <= j) {
					numbers.add(result);
				} else {
					numbers.set(j, result);
				}
			}
		}
		return numbers;
	}
}
