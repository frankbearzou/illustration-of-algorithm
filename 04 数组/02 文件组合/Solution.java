class Solution {
    public int[][] fileCombination(int target) {
        List<int[]> list = new ArrayList<>();
        int l = 1, r = 2, sum = 3;
        while (l < r) {
            if (sum < target) {
                r++;
                sum += r;
            } else if (sum > target) {
                sum -= l;
                l++;
            } else {
                int[] arr = new int[r - l + 1];
                for (int i = l; i <= r; i++) {
                    arr[i - l] = i;
                }
                list.add(arr);
                sum -= l;
                l++;
            }
        }
        int[][] ans = new int[list.size()][];
        for (int i = 0; i < ans.length; i++) {
            ans[i] = list.get(i);
        }
        return ans;
    }
}
