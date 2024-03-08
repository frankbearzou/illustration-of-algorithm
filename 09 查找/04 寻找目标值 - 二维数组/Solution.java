class Solution {
    public boolean findTargetIn2DPlants(int[][] plants, int target) {
        int row = plants.length;
        if (row == 0)
            return false;
        int col = plants[0].length;
        int i = 0, j = col - 1;
        while (i < row && j >= 0) {
            if (plants[i][j] == target)
                return true;
            else if (plants[i][j] < target)
                i++;
            else
                j--;
        }
        return false;
    }
}
