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
    TreeMap<Integer, Integer> valuesPerLevel = new TreeMap<>();
    public List<Integer> rightSideView(TreeNode root) {
        generateRightValues(0,root);


        return new ArrayList<Integer>(valuesPerLevel.values());
    }
    public void generateRightValues(int level,TreeNode root){
        if(root == null) return;
        valuesPerLevel.put(level, root.val);
        generateRightValues(level+1,root.left);
        generateRightValues(level+1,root.right);
    }
}
