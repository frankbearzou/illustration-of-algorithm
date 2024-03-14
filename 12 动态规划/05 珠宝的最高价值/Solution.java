class Solution {
    public int jewelleryValue(int[][] frame) {
        int row = frame.length, col = frame[0].length;
        int[][] dp = new int[row + 1][col + 1];
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= col; j++) {
                dp[i][j] = frame[i - 1][j - 1] + Math.max(dp[i - 1][j], dp[i][j - 1]);
            }
        }
        return dp[row][col];
    }
}
