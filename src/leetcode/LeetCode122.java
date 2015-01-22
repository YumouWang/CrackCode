package leetcode;

public class LeetCode122 {
	public int maxProfit(int[] prices) {
        if (prices == null) {
            return 0;
        }
            
        if (prices.length < 2) {
            return 0;
        }
        if (prices.length == 2) {
            if (prices[0] < prices[1]) {
                return prices[1] - prices[0];
            } else {
                return 0;
            }
        }
		int profit = 0;
		for (int i = 0; i < prices.length - 1; i ++) {
			if (prices[i] < prices[i + 1]) {
				profit += prices[i + 1] - prices[i];
			}
		}
		return profit;
    }
	
	public static void main(String[] args) {
		int[] prices = new int[]{3, 5, 7, 1, 2, 10, 8};
		LeetCode122 l = new LeetCode122();
		System.out.println(l.maxProfit(prices));
	}

}
