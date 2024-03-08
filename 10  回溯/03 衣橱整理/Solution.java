class Solution {
    int count = 0;
    int[][] dirs = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};

    public int wardrobeFinishing(int m, int n, int cnt) {
        boolean[][] dp = new boolean[m][n];
        int max = Math.max(m, n);
        int[] map = new int[max];
        for (int i = 0; i < max; i++) {
            map[i] = digit(i);
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (map[i] + map[j] <= cnt)
                    dp[i][j] = true;
            }
        }
        dfs(dp, 0, 0);
        return count;
    }

    int digit(int i) {
        int count = 0;
        while (i > 0) {
            count += i % 10;
            i /= 10;
        }
        return count;
    }

    void dfs(boolean[][] dp, int r, int c) {
        if (!dp[r][c])
            return;
        count++;
        dp[r][c] = false;
        for (int[] dir : dirs) {
            int newR = r + dir[0];
            int newC = c + dir[1];
            if (newR < 0 || newR >= dp.length || newC < 0 || newC >= dp[0].length)
                continue;
            dfs(dp, newR, newC);
        }
    }
}
