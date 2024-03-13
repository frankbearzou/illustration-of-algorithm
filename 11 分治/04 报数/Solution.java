class Solution {
    public int[] countNumbers(int cnt) {
        int count = 1;
        for (int i = 0; i < cnt; i++) {
            count *= 10;
        }
        count -= 1;
        int[] res = new int[count];
        for (int i = 1; i <= res.length; i++) {
            res[i - 1] = i;
        }
        return res;
    }
}
