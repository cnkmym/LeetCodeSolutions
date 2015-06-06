package containerwithmostwater;

public class Solution {
	public int maxArea(int[] height) {
		if (height == null || height.length == 0) {
			return 0;
		}
		int maxVolumn = 0;
		for (int i = 0; i < height.length; i++) {
			for (int j = i + 1; j < height.length; j++) {
				int volumn = (j - i) * Math.min(height[i], height[j]);
				if (volumn > maxVolumn) {
					maxVolumn = volumn;
				}
			}
		}
		return maxVolumn;
	}
}