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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        ArrayList<Integer> l1 = new ArrayList<Integer>();
        ArrayList<Integer> l2 = new ArrayList<Integer>();

        l1 = list(p, l1);
        l2 = list(q, l2);

        for(int i = 0; i < l1.size(); i++){
            if(l1.get(i) != l2.get(i)) return false;
        }

        return true;
    }

    private ArrayList<Integer> list(TreeNode n, ArrayList<Integer> nList){
        if(n == null){
            nList.add(null);
            return nList;
        };

        nList.add(n.val);

        list(n.left, nList);
        list(n.right, nList);

        return nList;
    }
}
