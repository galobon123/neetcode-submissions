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

    int bestD = 0;

    public int diameterOfBinaryTree(TreeNode root) {
        
        path(root);

        return bestD;
    }

    private int path(TreeNode n){
        if(n == null) return 0;

        int l = path(n.left);
        int r = path(n.right);

        int d = l + r;

        if(d > bestD) bestD = d;

        return Math.max(l, r) + 1;
    }
}
