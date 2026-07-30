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
    public boolean isBalanced(TreeNode root) {
        if (root == null) return true;
        int left = smd(root.left,0);
        int right = smd(root.right,0);
        System.out.println(left +""+ right);
        int diff = Math.abs(left-right);
        if( left != -1 && right != -1 && (diff == 0 || diff == 1)) return true;
        return false;
    }
    public int smd(TreeNode curr, int counter){
        //SearchMaxDepth
        if(curr == null) return counter;
        counter +=1;

        int left = smd(curr.left,counter);
        int right = smd(curr.right,counter);

        int diff = Math.abs(left- right);
        if(diff > 1 || left == -1 || right == -1){
            return -1;
        }
        return Math.max(left,right); 
    }
}
