package zigzeg;

import java.util.ArrayList;
import java.util.List;

public class Solution {
	public String convert(String s, int numRows) {
		int length = s.length();
		if (length < 2 || numRows == 1) {
			return s;
		}
		List<Character> line = new ArrayList<Character>(length);
		int step = 2 * numRows - 2;
		int index = 0;
		// first line
		while (index < length) {
			line.add(s.charAt(index));
			index += step;
		}
		// middle lines
		for (int i = 1; i < numRows - 1; i++) {
			int step1 = 2 * (numRows - 1 - i) - 1;
			int step2 = 2 * i - 1;
			boolean odd = true;
			index = i;
			while (index < length) {
				line.add(s.charAt(index));
				if (odd) {
					index = index + step1 + 1;
					odd = false;
				} else {
					index = index + step2 + 1;
					odd = true;
				}
			}
		}

		// last line
		index = numRows - 1;
		// first line
		while (index < length) {
			line.add(s.charAt(index));
			index += step;
		}

		return getStringRepresentation(line);
	}

	private String getStringRepresentation(List<Character> list) {
		StringBuilder builder = new StringBuilder(list.size());
		for (Character ch : list) {
			builder.append(ch);
		}
		return builder.toString();
	}

	/**
	 * 0 2n-2 1 . 2n-1 2 . 2n 3 . . .
	 * 
	 * n+1 . .. . n . 3n-2 n-1 3n-3
	 */
}
