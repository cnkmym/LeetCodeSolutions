package uniquebinarysearchtree;

public class Solution {
	int[] dp = new int[10000];

	public Solution() {
		dp[0] = 1;
	}

	public int numTrees(int n) {
		if (dp[n] > 0) {
			return dp[n];
		}
		dp[n] = 0;
		for (int i = 1; i <= n; i++) {
			dp[n] += numTrees(n, i);
		}
		return dp[n];
	}

	private int numTrees(int n, int votex) {
		return numTrees(n - votex) * numTrees(votex - 1);
	}

}
