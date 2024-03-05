class Solution {
    public int myAtoi(String str) {
        //-2147483648
        //2147483647
        str = str.trim();
        int res = 0;
        int sign = 1;
        char[] arr = str.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            if (i == 0) {
                if (arr[i] == '-') {
                    sign = -1;
                    continue;
                } else if (arr[i] == '+') {
                    sign = 1;
                    continue;
                }
            }
            if (arr[i] >= '0' && arr[i] <= '9') {
                int d = (int)(arr[i] - '0');
                if (res > 214748364 || (res == 214748364 && d > 7)) {
                    if (sign == 1)
                        return Integer.MAX_VALUE;
                    else
                        return Integer.MIN_VALUE;
                }
                res = 10 * res + d;
            } else
                break;
        }
        return sign * res;
    }
}
