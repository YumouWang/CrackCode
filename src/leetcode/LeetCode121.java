package leetcode;

public class LeetCode121 {
	
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
		int price = 0;
		for (int i = prices.length - 1; i >= 0; i --) {
			price = Math.max(price, prices[i]);
			profit = Math.max(profit, price - prices[i]);
		}
		return profit;
    }
	
	public static void main(String[] args) {
		int[] prices = new int[]{1,2,4};
		LeetCode121 l = new LeetCode121();
		System.out.println(l.maxProfit(prices));
	}

}
