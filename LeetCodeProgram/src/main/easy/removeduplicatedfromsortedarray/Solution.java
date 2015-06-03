package removeduplicatedfromsortedarray;

public class Solution {
	public int removeDuplicates(int[] nums) {
		int length = 0;
		int previous = 0;
		for (int i = 0; i < nums.length; i++) {
			if (i == 0) {
				// first element
				previous = nums[i];
				length++;
			} else if (nums[i] != previous) {
				// different element
				previous = nums[i];
				nums[length++] = previous;
			} 
		}
		return length;
	}
}
