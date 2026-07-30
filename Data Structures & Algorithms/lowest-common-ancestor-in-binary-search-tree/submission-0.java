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
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {

        TreeNode pointer = root;
        TreeNode lastCommon = root;
        while(pointer != null){
            if(pointer.val < p.val && pointer.val < q.val){
                pointer = pointer.right;
                if(pointer != null) lastCommon = pointer;
            }
            else if(pointer.val > p.val && pointer.val > q.val){
                 pointer = pointer.left;
                if(pointer != null) lastCommon = pointer;
            }
            else{
                // if some of p or q is equal to pointer OR both of them split in direction from current pointer
                lastCommon = pointer;
                break;
            }
        }
        return lastCommon;
    }
}
