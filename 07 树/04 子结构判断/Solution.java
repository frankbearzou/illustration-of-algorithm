/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public boolean isSubStructure(TreeNode A, TreeNode B) {
        if (A == null || B == null)
            return false;
        if (isSame(A, B))
            return true;
        return isSubStructure(A.left, B) || isSubStructure(A.right, B);
    }

    boolean isSame(TreeNode A, TreeNode B) {
        if (A == null && B == null)
            return true;
        if (A != null && B == null)
            return true;
        if (A == null && B != null)
            return false;
        if (A.val != B.val)
            return false;
        return isSame(A.left, B.left) && isSame(A.right, B.right);
    }
}
