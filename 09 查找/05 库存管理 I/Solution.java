class Solution {
    public int stockManagement(int[] stock) {
        int n = stock.length;
        int l = 0, r = n - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (stock[m] <= stock[r])
                r--;
            else
                l = m + 1;
        }
        return stock[l];
    }
}
