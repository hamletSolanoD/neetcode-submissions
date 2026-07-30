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
    double lowerCloser = Double.MAX_VALUE;
    int foundNode = 0;
    double Target = 0;
    public int closestValue(TreeNode root, double target) {
        Target = target;
        dfs(root);
        return foundNode;
    }

    public void dfs(TreeNode root){
        if(root == null) return;
        double difference = Math.abs(Target - ((double)root.val));
        if(difference == lowerCloser){
            double diffWithSign =  Target - ((double)root.val);
            if(diffWithSign < lowerCloser){
                foundNode = root.val;
                lowerCloser = difference;
            }
        }
        else if(difference < lowerCloser ){
            foundNode = root.val;
            lowerCloser = difference;
        }
     
        dfs(root.left);
        dfs(root.right);
    }
}
