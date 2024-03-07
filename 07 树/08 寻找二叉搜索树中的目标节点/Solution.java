/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    int res, count;

    public int findTargetNode(TreeNode root, int cnt) {
        count = cnt;
        dfs(root);
        return res;
    }

    void dfs(TreeNode root) {
        if (root == null)
            return;
        dfs(root.right);
        if (count == 0)
            return;
        if (--count == 0) {
            res = root.val;
            return;
        }
        dfs(root.left);
    }
}
