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
    int res = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        maxDiameter(root);
        return res;
    }

    public int maxDiameter(TreeNode root){
        if(root == null) return 0;
        int leftDiameter = maxDiameter(root.left);
        int rightDiameter = maxDiameter(root.right);
        res = Math.max(res, leftDiameter+rightDiameter);
        return Math.max(leftDiameter, rightDiameter)+1;
    }
}
