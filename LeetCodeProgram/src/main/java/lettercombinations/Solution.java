package lettercombinations;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Solution {
	Map<Character, char[]> keyMapper;
	List<String> possibilities;

	public Solution() {
		keyMapper = new HashMap<Character, char[]>();
		keyMapper.put('1', new char[] {});
		keyMapper.put('2', new char[] { 'a', 'b', 'c' });
		keyMapper.put('3', new char[] { 'd', 'e', 'f' });
		keyMapper.put('4', new char[] { 'g', 'h', 'i' });
		keyMapper.put('5', new char[] { 'j', 'k', 'l' });
		keyMapper.put('6', new char[] { 'm', 'n', 'o' });
		keyMapper.put('7', new char[] { 'p', 'q', 'r', 's' });
		keyMapper.put('8', new char[] { 't', 'u', 'v' });
		keyMapper.put('9', new char[] { 'w', 'x', 'y', 'z' });
	}

	public List<String> letterCombinations(String digits) {
		possibilities = new LinkedList<String>();
		if (digits == null || "".equals(digits)) {
			return possibilities;
		}
		// DFS
		char[] digitNumbers = digits.toCharArray();
		char[] current = new char[digitNumbers.length];
		traverse(current, digitNumbers, 0);

		return possibilities;
	}

	private void traverse(char[] current, char[] numbers, int index) {
		if (!keyMapper.containsKey(numbers[index])) {
			throw new IllegalArgumentException("Unsupported Input " + String.valueOf(numbers));
		}
		char[] variables = keyMapper.get(numbers[index]);
		for (int i = 0; i < variables.length; i++) {
			current[index] = variables[i];
			if (index < numbers.length - 1) {
				traverse(current, numbers, index + 1);
			} else {
				possibilities.add(String.valueOf(current));
			}
		}
	}
}
