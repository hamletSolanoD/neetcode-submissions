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
    int kCounter = 0;
    int kvalue = 0;
    int kSearch;
    public int kthSmallest(TreeNode root, int k) {
        kSearch = k; 
       deepSearch(root);
        return kvalue;
    }
    public void deepSearch(TreeNode root){
        if(root == null) return;
         deepSearch(root.left);
        kCounter++;
        if(kCounter == kSearch) kvalue = root.val;
        deepSearch(root.right);
    }
}
