package reverseinteger;

import java.util.LinkedList;
import java.util.Queue;

public class Solution {
	public int reverse(int x) {
		if (x >= Integer.MAX_VALUE || x <= Integer.MIN_VALUE) {
			return 0;
		}
		boolean isNegtive = x < 0;
		Queue<Integer> myQueue = new LinkedList<Integer>();
		int remain = (isNegtive) ? -1 * x : x;
		while (remain > 0) {
			int value = remain % 10;
			remain = remain / 10;
			myQueue.add(value);
		}
		while (!myQueue.isEmpty()) {
			int v = myQueue.poll();
			Double temp = remain * 10.0 + v;
			if (temp > Integer.MAX_VALUE) {
				return 0;
			}
			remain = temp.intValue();
		}
		remain = (isNegtive) ? -1 * remain : remain;
		return remain;
	}
}
