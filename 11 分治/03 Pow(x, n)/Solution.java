class Solution {
    public double myPow(double x, int n) {
        if (n == 0)
            return 1;
        double res = 1;
        long m = n;
        if (m < 0) {
            x = 1 / x;
            m = -m;
        }
        while (m > 1) {
            if (m % 2 == 1) {
                res *= x;
                m -= 1;
            }
            x *= x;
            m /= 2;
        }
        return res * x;
    }
}
