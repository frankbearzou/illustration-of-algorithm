class Solution {
    public int bestTiming(int[] prices) {
        if (prices.length == 0)
            return 0;
        int profit = 0;
        int buy = prices[0];
        for (int price : prices) {
            if (price < buy)
                buy = price;
            else
                profit = Math.max(profit, price - buy);
        }
        return profit;
    }
}
