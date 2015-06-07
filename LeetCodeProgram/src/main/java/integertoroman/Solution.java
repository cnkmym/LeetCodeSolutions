package integertoroman;

import java.util.HashMap;
import java.util.Map;

public class Solution {
	private static Map<Integer, String> values;

	static {
		values = new HashMap<Integer, String>();
		// 1 digit
		values.put(1, "I");
		values.put(2, "II");
		values.put(3, "III");
		values.put(4, "IV");
		values.put(5, "V");
		values.put(6, "VI");
		values.put(7, "VII");
		values.put(8, "VIII");
		values.put(9, "IX");
		// 2 digit
		values.put(10, "X");
		values.put(20, "XX");
		values.put(30, "XXX");
		values.put(40, "XL");
		values.put(50, "L");
		values.put(60, "LX");
		values.put(70, "LXX");
		values.put(80, "LXXX");
		values.put(90, "XC");
		// 3 digit
		values.put(100, "C");
		values.put(200, "CC");
		values.put(300, "CCC");
		values.put(400, "CD");
		values.put(500, "D");
		values.put(600, "DC");
		values.put(700, "DCC");
		values.put(800, "DCCC");
		values.put(900, "CM");

		// 4 digit
		values.put(1000, "M");
		values.put(2000, "MM");
		values.put(3000, "MMM");
	}

	public String intToRoman(int num) {
		if (num == 0) {
			return "";
		}
		int step = 1000;
		StringBuilder sb = new StringBuilder();
		while (step > 0) {
			int val = num / step;
			num = num % step;
			if (val > 0) {
				sb.append(values.get(step * val));
			}
			step = step / 10;
		}
		return sb.toString();
	}
}
