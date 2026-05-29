package dsa;

public class BestTimeToBuyAndSellStocks {
	public static void main(String[] args) {
		int prices[] = { 7,6,4,3,1 };
//		int prices[] = { 7, 1, 5, 3, 6, 4 };

		int minPrice = prices[0];
		int profit = 0;
		int maxProfit = 0;
		for (int i = 1; i < prices.length; i++) {
			if(prices[i]<minPrice) {
				minPrice = prices[i];
			}
			profit = prices[i] - minPrice;
			if(profit>maxProfit) {
				maxProfit = profit; 
			}
		}
		System.out.println(maxProfit);

	}
}
