class Solution {
    int[][] dirs = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};

    public boolean wordPuzzle(char[][] grid, String target) {
        int r = grid.length, c = grid[0].length;
        boolean[][] visited = new boolean[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (dfs(grid, i, j, target, 0, visited))
                    return true;
            }
        }
        return false;
    }

    boolean dfs(char[][] grid, int r, int c, String target, int index, boolean[][] visited) {
        if (index == target.length())
            return true;
        if (visited[r][c])
            return false;
        if (target.charAt(index) != grid[r][c])
            return false;
        if (index + 1 == target.length())
            return true;
        visited[r][c] = true;
        for (int[] dir : dirs) {
            int newR = r + dir[0];
            int newC = c + dir[1];
            if (newR < 0 || newR >= grid.length || newC < 0 || newC >= grid[0].length)
                continue;
            if (dfs(grid, newR, newC, target, index + 1, visited))
                return true;
        }
        visited[r][c] = false;
        return false;
    }
}
