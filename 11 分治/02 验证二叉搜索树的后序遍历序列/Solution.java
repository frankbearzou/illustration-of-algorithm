class Solution {
    public boolean verifyTreeOrder(int[] postorder) {
        return recur(postorder, 0, postorder.length - 1);
    }

    boolean recur(int[] postorder, int l, int r) {
        if (l >= r)
            return true;
        int p = l;
        while (postorder[p] < postorder[r]) p++;
        int m = p;
        while (postorder[p] > postorder[r]) p++;
        return p == r && recur(postorder, l, m - 1) && recur(postorder, m, r - 1);
    }
}
