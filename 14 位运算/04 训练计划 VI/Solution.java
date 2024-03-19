class Solution {
    public int trainingPlan(int[] actions) {
        int res = 0;
        int[] arr = new int[32];
        for (int action : actions) {
            int index = 0;
            while (action > 0) {
                int d = action & 1;
                arr[index] += d;
                action >>= 1;
                index++;
            }
        }
        for (int i = 31; i >= 0; i--) {
            arr[i] %= 3;
            res <<= 1;
            res |= arr[i];
        }
        return res;
    }
}
