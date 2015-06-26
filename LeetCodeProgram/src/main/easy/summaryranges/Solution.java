package summaryranges;

import java.util.ArrayList;
import java.util.List;

public class Solution {
	private List<String> ret;

	public List<String> summaryRanges(int[] nums) {
		ret = new ArrayList<String>();

		if (nums == null || nums.length == 0) {
			return ret;
		}

		int current = 0;
		Pair currentPair = null;
		for (int i = 0; i < nums.length; i++) {
			if (i == 0) {
				current = nums[i];
				currentPair = new Pair(current);
				continue;
			}

			currentPair.setEnd(current);
			current = nums[i];

			if (nums[i] - currentPair.end == 1) {
				continue;
			}

			ret.add(currentPair.toString());
			currentPair = new Pair(current);
		}
		if (currentPair != null) {
			currentPair.setEnd(current);
			ret.add(currentPair.toString());
		}
		return ret;
	}
}

class Pair {
	public Integer start;
	public Integer end;

	public void setEnd(Integer end) {
		this.end = end;
	}

	public void setStart(Integer start) {
		this.start = start;
	}

	public Pair(Integer start) {
		this.start = start;
		this.end = start;
	}

	public Pair(Integer start, Integer end) {
		this.start = start;
		this.end = end;
	}

	@Override
	public String toString() {
		return end.equals(start) ? start.toString() : start + "->" + end;
	}
}

class ListNode {
	public int val;
	public ListNode next;

	public ListNode(int x) {
		val = x;
	}
}
