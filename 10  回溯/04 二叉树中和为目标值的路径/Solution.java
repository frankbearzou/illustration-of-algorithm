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
    List<List<Integer>> res = new ArrayList<>();

    public List<List<Integer>> pathTarget(TreeNode root, int target) {
        List<Integer> path = new ArrayList<>();
        dfs(root, path, target);
        return res;
    }

    void dfs(TreeNode root, List<Integer> path, int target) {
        if (root == null)
            return;
        path.add(root.val);
        if (root.left == null && root.right == null && root.val == target) {
            res.add(new ArrayList(path));
        }
        dfs(root.left, path, target - root.val);
        dfs(root.right, path, target - root.val);
        path.remove(path.size() - 1);
    }
}
