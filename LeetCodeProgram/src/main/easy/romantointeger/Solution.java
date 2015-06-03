package romantointeger;

import java.util.HashMap;
import java.util.Map;

public class Solution {
	private static Map<String, Integer> values;

	static{
		values = new HashMap<String, Integer>();
		// 1 digit
		values.put("I", 1);
		values.put("V", 5);
		values.put("IV", 4);
		values.put("IX", 9);
		// 2 digit
		values.put("X", 10);
		values.put("L", 50);
		values.put("XL", 40);
		values.put("XC", 90);
		// 3 digit
		values.put("C", 100);
		values.put("D", 500);
		values.put("CD", 400);
		values.put("CM", 900);
		// 4 digit
		values.put("M", 1000);
	}

	public int romanToInt(String s) {
		// accumulative algorithm
		// consecutive string pair is higher priority
		int index = 0;
		int sum = 0;
		String pair = "";
		while (index < s.length()) {
			if (index < s.length() - 1) {
				pair = s.substring(index, index + 2);
				if (values.containsKey(pair)) {
					index += 2;
					sum += values.get(pair);
					continue;
				}
			}
			pair = s.substring(index, index + 1);
			sum += values.get(pair);
			index++;
		}
		return sum;
	}
}