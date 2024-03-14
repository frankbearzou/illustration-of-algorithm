class Solution {
    public int maxSales(int[] sales) {
        int n = sales.length;
        int[] dp = new int[n];
        dp[0] = sales[0];
        int max = sales[0];
        for (int i = 1; i < n; i++) {
            dp[i] = Math.max(sales[i], dp[i - 1] + sales[i]);
            max = Math.max(max, dp[i]);
        }
        return max;
    }
}
