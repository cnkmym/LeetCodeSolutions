package containerwithmostwater;

public class Solution {
	// method 1 : Naive nested for loop
	// public int maxArea(int[] height) {
	// if (height == null || height.length == 0) {
	// return 0;
	// }
	// int maxVolumn = 0;
	// for (int i = 0; i < height.length; i++) {
	// for (int j = i + 1; j < height.length; j++) {
	// int volumn = (j - i) * Math.min(height[i], height[j]);
	// if (volumn > maxVolumn) {
	// maxVolumn = volumn;
	// }
	// }
	// }
	// return maxVolumn;
	// }

	// method 2 : Recursive + simple de-branch
	// public int maxArea(int[] height) {
	// if (height == null || height.length == 0) {
	// return 0;
	// }
	// return findMax(height, 0, height.length - 1);
	// }
	//
	// private int findMax(int[] height, int left, int right) {
	// if (left >= right) {
	// return 0;
	// }
	// int useAll = (right - left) * Math.min(height[left], height[right]);
	// int usePart = (height[right] > height[left]) ? findMax(height, left + 1,
	// right) : findMax(height, left,
	// right - 1);
	// return Math.max(useAll, usePart);
	// }

	// method 3 : change recursive method to iterative method
	public int maxArea(int[] height) {
		if (height == null || height.length == 0) {
			return 0;
		}
		int left = 0;
		int right = height.length - 1;
		int max = 0;
		while (left < right) {
			int useAll = (right - left) * Math.min(height[left], height[right]);
			max = (max < useAll) ? useAll : max;
			if (height[left] < height[right]) {
				left++;
			} else {
				right--;
			}
		}
		return max;
	}

}