class Solution {
    public boolean validNumber(String s) {
        s = s.trim();
        int n = s.length();
        int idxE = -1;
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == 'e' || s.charAt(i) == 'E') {
                if (idxE == -1) {
                    idxE = i;
                } else {
                    return false;
                }
            }
        }
        if (idxE == -1) {
            return isNumber(s, 0, n - 1, true);
        } else {
            return isNumber(s, 0, idxE - 1, true) && isNumber(s, idxE + 1, n - 1, false);
        }
    }

    boolean isNumber(String s, int start, int end, boolean isDecimal) {
        int n = s.length();
        if (start > end || start >= n || end >= n)
            return false;
        if (s.charAt(start) == '+' || s.charAt(start) == '-') start++;
        int dot = -1;
        boolean digit = false;
        for (int i = start; i <= end; i++) {
            if (s.charAt(i) == '.') {
                if (!isDecimal)
                    return false;
                if (dot == -1) {
                    dot = i;
                } else
                    return false;
            } else if (s.charAt(i) >= '0' && s.charAt(i) <= '9') {
                digit = true;
            } else
                return false;
        }
        return digit;
    }
}
