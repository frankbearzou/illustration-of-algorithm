class Solution {
    public int[] trainingPlan(int[] actions) {
        int n = actions.length;
        int[] ans = new int[n];
        List<Integer> odd = new ArrayList<>();
        List<Integer> even = new ArrayList<>();
        for (int num : actions) {
            if (num % 2 == 1)
                odd.add(num);
            else
                even.add(num);
        }
        int i = 0;
        for (int num : odd) {
            ans[i++] = num;
        }
        for (int num : even) {
            ans[i++] = num;
        }
        return ans;
    }
}
