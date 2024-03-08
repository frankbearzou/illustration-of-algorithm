class Solution {
    public int countTarget(int[] scores, int target) {
        int n = scores.length, l = 0, r = n - 1;
        int mid = -1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (scores[m] == target) {
                mid = m;
                break;
            } else if (scores[m] < target) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        if (mid == -1)
            return 0;
        l = r = mid;
        while (l > 0 && scores[l - 1] == target)
            l--;
        while (r < n - 1 && scores[r + 1] == target)
            r++;
        return r - l + 1;
    }
}
