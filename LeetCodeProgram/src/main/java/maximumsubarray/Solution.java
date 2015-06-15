package maximumsubarray;

public class Solution {
	public int maxSubArray(int[] nums) {
		if (nums == null || nums.length == 0) {
			return 0;
		}
		int maximum = Integer.MIN_VALUE;
		int possitiveSectionSum = 0;
		for (int i : nums) {
			possitiveSectionSum = Math.max(possitiveSectionSum + i, i);
			if (possitiveSectionSum > maximum) {
				maximum = possitiveSectionSum;
			}
		}
		return maximum;
	}
}
