class Solution {
    public int findKthNumber(int k) {
        int digit = 1;
        long start = 1, count = 9;
        while (k > count) {
            k -= count;
            start *= 10;
            digit++;
            count = 9 * start * digit;
        }
        long num = start + (k - 1) / digit;
        return String.valueOf(num).charAt((k - 1) % digit) - '0';
    }
}
