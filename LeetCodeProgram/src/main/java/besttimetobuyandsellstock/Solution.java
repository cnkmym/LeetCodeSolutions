package besttimetobuyandsellstock;

public class Solution {
	public int maxProfit(int[] prices) {
		int buyPrice;
		int sellPrice;
		int profit = 0;

		if (prices == null || prices.length == 0) {
			return 0;
		}

		buyPrice = prices[0];
		sellPrice = prices[0];
		profit = 0;

		for (int i = 1; i < prices.length; i++) {
			if (prices[i] > sellPrice) {
				sellPrice = prices[i];
				int newProfit = sellPrice - buyPrice;
				if (newProfit > profit) {
					profit = newProfit;
				}
				continue;
			}
			if (prices[i] < buyPrice) {
				sellPrice = prices[i];
				buyPrice = prices[i];
				int newProfit = sellPrice - buyPrice;
				if (newProfit > profit) {
					profit = newProfit;
				}
			}
		}

		return profit;
	}
}
