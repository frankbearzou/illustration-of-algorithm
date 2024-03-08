class Solution {
    public int stockManagement(int[] stock) {
        int n = stock.length, l = 0, r = n - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (stock[m] < stock[r])
                r = m;
            else if (stock[m] > stock[r])
                l = m + 1;
            else
                r--;
        }
        return stock[l];
    }
}
