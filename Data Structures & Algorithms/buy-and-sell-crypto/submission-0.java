class Solution {
    public int maxProfit(int[] prices) {
    int minPriceSoFar = prices[0], maxprofit = 0;

    for (int i = 1; i < prices.length; i++) {
        int profit_if_sold_today = prices[i] - minPriceSoFar;

        if (profit_if_sold_today > maxprofit) {
            maxprofit = profit_if_sold_today;
        }

        if (prices[i] < minPriceSoFar) {
            minPriceSoFar = prices[i];
        }
    }

    return maxprofit;
}
}
