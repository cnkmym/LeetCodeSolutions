package poweroftwo;

public class Solution {
	public boolean isPowerOfTwo(int n) {
		int bitMask = 0x0001;
		int number = n;
		int countBit1 = 0;
		while (number > 0) {
			int tmp = number & bitMask;
			if (tmp == 1) {
				countBit1++;
			}
			number = number >>> 1;
		}
		return countBit1 == 1;
	}
}
