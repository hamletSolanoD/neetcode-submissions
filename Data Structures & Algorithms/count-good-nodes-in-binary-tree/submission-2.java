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
    int goodNodes = 0;
    public int goodNodes(TreeNode root) {
        recursiveGoodNodes(root, root.val);
        return goodNodes;
        
    }
    public void recursiveGoodNodes(TreeNode root, int maxValue){
        if(root == null)return;
        maxValue = Math.max(maxValue,root.val);
        if(root.val < maxValue){
            recursiveGoodNodes(root.left,maxValue);
            recursiveGoodNodes(root.right, maxValue);
        }
        else if(root.val == maxValue){
            goodNodes++;
            recursiveGoodNodes(root.left,maxValue);
            recursiveGoodNodes(root.right, maxValue);
        }
        else{
            goodNodes++;
            return;
        }


        }

    }

