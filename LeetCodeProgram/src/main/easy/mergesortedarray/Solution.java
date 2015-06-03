package mergesortedarray;

public class Solution {
	public void merge(int[] nums1, int m, int[] nums2, int n) {
		// simple strategy
		// compare the two arrays from high digit to low digit
		// the winner value will be inserted into target position (from
		// pos[m+n-1] to pos[0]) in nums1
		// the looser value will be compared in the next round

		int indexM = m - 1;
		int indexN = n - 1;
		int index = m + n - 1;
		while (indexM >= 0 && indexN >= 0) {
			if (nums1[indexM] >= nums2[indexN]) {
				nums1[index--] = nums1[indexM--];
			} else {
				nums1[index--] = nums2[indexN--];
			}
		}
		while (indexM >= 0) {
			nums1[index--] = nums1[indexM--];
		}
		while (indexN >= 0) {
			nums1[index--] = nums2[indexN--];
		}
	}
}
