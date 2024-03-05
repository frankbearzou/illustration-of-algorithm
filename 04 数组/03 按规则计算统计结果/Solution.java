class Solution {
    public int[] statisticalResult(int[] arrayA) {
        int n = arrayA.length;
        int[] arr = new int[n];
        if (n == 0)
            return arr;
        arr[0] = 1;
        for (int i = 1; i < n; i++) {
            arr[i] = arr[i - 1] * arrayA[i - 1];
        }
        int t = 1;
        for (int i = n - 2; i >= 0; i--) {
            t *= arrayA[i + 1];
            arr[i] *= t;
        }
        return arr;
    }
}
