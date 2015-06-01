package reversebit;

public class Solution {
	// you need treat n as an unsigned value
	public int reverseBits(int n) {
		int result = 0;
		for (int i = 0; i < 32; i++) {
			// every time,
			// get bit in position i
			int bit = (n >>> i) & 1;
			// convert it to position (3i-i)
			int convertedBit = bit << (31 - i);
			// use bit OR to merge result
			result = result | convertedBit;
		}
		return result;
	}
}
