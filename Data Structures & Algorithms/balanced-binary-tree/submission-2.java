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
    private boolean diff = true;

    public boolean isBalanced(TreeNode root) {
        path(root);

        return diff;
    }

    private int path(TreeNode n){
        if(n == null) return 0;

        int l = path(n.left);
        int r = path(n.right);

        if(Math.abs(l - r) > 1) diff = false;

        return Math.max(l,r) + 1;
    }
}
