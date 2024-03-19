class Solution {
    public int cuttingBamboo(int bamboo_len) {
        int res = 0;
        int[] dp = new int[bamboo_len + 1];
        dp[1] = 1;
        for (int i = 1; i <= bamboo_len; i++) {
            for (int j = 1; j < i; j++) {
                dp[i] = Math.max(dp[i], Math.max(dp[j] * (i - j), j * (i - j)));
            }
            res = Math.max(res, dp[i]);
        }
        return res;
    }
}
