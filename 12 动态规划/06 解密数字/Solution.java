class Solution {
    public int crackNumber(int ciphertext) {
        String cipher = String.valueOf(ciphertext);
        int n = cipher.length();
        int[] arr = new int[n];
        int index = 0;
        for (char c : cipher.toCharArray()) {
            arr[index++] = c - '0';
        }
        int[] dp = new int[n + 1];
        dp[0] = 1;
        dp[1] = 1;
        for (int i = 2; i <= n; i++) {
            if (arr[i - 2] == 1 || (arr[i - 2] == 2 && arr[i - 1] <= 5))
                dp[i] = dp[i - 1] + dp[i - 2];
            else
                dp[i] = dp[i - 1];
        }
        return dp[n];
    }
}
