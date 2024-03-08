class Solution {
    public int takeAttendance(int[] records) {
        int n = records.length;
        int l = 0, r = n - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (records[m] <= m)
                l = m + 1;
            else
                r = m - 1;
        }
        return l;
    }
}
