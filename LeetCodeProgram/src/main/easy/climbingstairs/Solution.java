package climbingstairs;

import java.util.Arrays;

public class Solution {
	private int[] climbingWays;

	public int climbStairs(int n) {
		// simple DP method
		// c(n) = 1*c(n-1) + 1*c(n-2)
		// ...
		// c(2) = 2;
		// c(1) = 1;
		if (n <= 0) {
			return 0;
		}
		climbingWays = new int[Math.max(3, n + 1)];// pay attention to the
													// correct array size
		Arrays.fill(climbingWays, 0);
		climbingWays[1] = 1;// there is only 1 way for 1 step stair
		climbingWays[2] = 2;// there are two different ways for 2 step stair

		return countWays(n);
	}

	private int countWays(int steps) {
		if (steps <= 2) {
			return climbingWays[steps];
		} else if (climbingWays[steps] > 0) {
			return climbingWays[steps];
		} else {
			int ret = countWays(steps - 1) + countWays(steps - 2);
			climbingWays[steps] = ret;
			return ret;
		}
	}
}
