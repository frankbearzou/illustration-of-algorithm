class Solution {
    int[] arr;

    public int reversePairs(int[] record) {
        arr = new int[record.length];
        return merge(record, 0, record.length - 1);
    }

    int merge(int[] record, int l, int r) {
        if (l >= r)
            return 0;
        int m = (l + r) / 2;
        int res = merge(record, l, m) + merge(record, m + 1, r);
        int i = l, j = m + 1;
        for (int k = i; k <= r; k++) {
            arr[k] = record[k];
        }
        for (int k = i; k <= r; k++) {
            if (i == m + 1) {
                record[k] = arr[j++];
            } else if (j == r + 1 || arr[i] <= arr[j]) {
                record[k] = arr[i++];
            } else {
                record[k] = arr[j++];
                res += m - i + 1;
            }
        }
        return res;
    }
}
