class Solution {
    public int trainWays(int num) {
        if (num < 2)
            return 1;
        int a = 1, b = 1, res = 0;
        for (int i = 2; i <= num; i++) {
            res = (a + b) % 1000000007;
            a = b;
            b = res;
        }
        return res;
    }
}
