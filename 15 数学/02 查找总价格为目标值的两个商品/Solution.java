class Solution {
    public int[] twoSum(int[] price, int target) {
        int l = 0, r = price.length - 1;
        while (l < r) {
            int sum = price[l] + price[r];
            if (sum == target)
                return new int[]{price[l], price[r]};
            else if (sum < target)
                l++;
            else
                r--;
        }
        return new int[0];
    }
}
