package multiplystrings;

public class Solution {
	public String multiply(String num1, String num2) {
		if (num1.length() < num2.length()) {
			String tmp = num2;
			num2 = num1;
			num1 = tmp;
		}

		char[] num1Digit = num1.toCharArray();
		int[] digit1 = new int[num1Digit.length];
		for (int i = 0; i < num1Digit.length; i++) {
			digit1[i] = num1Digit[num1Digit.length - i - 1] - '0';
		}

		char[] num2Digit = num2.toCharArray();
		int[] digit2 = new int[num2Digit.length];
		for (int i = 0; i < num2Digit.length; i++) {
			digit2[i] = num2Digit[num2Digit.length - i - 1] - '0';
		}

		int[] result = new int[num1Digit.length + num2Digit.length + 1];
		for (int i = 0; i < num2Digit.length; i++) {
			for (int j = 0; j < num1Digit.length; j++) {
				result[i + j] = result[i + j] + digit2[i] * digit1[j];
			}
		}
		for (int i = 0; i < num2Digit.length + num1Digit.length; i++) {
			int v = result[i] % 10;
			int o = result[i] / 10;
			result[i + 1] += o;
			result[i] = v;
		}

		int index = result.length - 1;
		while (index > 0 && result[index] == 0) {
			index--;
		}

		StringBuilder sb = new StringBuilder();
		while (index >= 0) {
			sb.append(result[index--]);
		}
		return sb.toString();
	}
}
