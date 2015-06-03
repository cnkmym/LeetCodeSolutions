package containsduplicate;

import java.util.HashMap;
import java.util.Map;

public class Solution2 {
	public boolean containsNearbyDuplicate(int[] nums, int k) {
		// simple solution : use hashMap to check duplicate

		if (nums == null || nums.length == 0) {
			return false;
		}

		Map<Integer, Integer> visited = new HashMap<Integer, Integer>();
		for (int i = 0; i < nums.length; i++) {
			int num = nums[i];
			if (visited.containsKey(num) && visited.get(num) + k >= i) {
				return true;
			}
			visited.put(num, i);
		}
		return false;
	}
}
