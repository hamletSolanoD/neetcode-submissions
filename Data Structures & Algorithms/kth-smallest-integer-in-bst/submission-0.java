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
    public int kthSmallest(TreeNode root, int k) {
       deepSearch(root,k);
        return kvalue;
    }
    public int deepSearch(TreeNode root, int k){
        if(root == null) return Integer.MAX_VALUE;
        int leftvalue = deepSearch(root.left,k);
        kCounter++;
        if(kCounter == k) kvalue = root.val;
        int rightValue = deepSearch(root.right,k);

    return root.val;
    }
}
