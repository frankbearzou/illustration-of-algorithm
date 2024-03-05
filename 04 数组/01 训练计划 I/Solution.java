class Solution {
    public int[] trainingPlan(int[] actions) {
        int n = actions.length;
        int l = 0, r = n - 1;
        while (l < r) {
            while (l < r && actions[l] % 2 == 1)
                l++;
            while (l < r && actions[r] % 2 == 0)
                r--;
            int t = actions[l];
            actions[l] = actions[r];
            actions[r] = t;
        }
        return actions;
    }
}
