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
    HashMap<Integer, ArrayList<Integer> > mapOfNodes = new HashMap<>();
    public List<List<Integer>> levelOrder(TreeNode root) {
        addToMap(root, 0);
        return new ArrayList<List<Integer>>(mapOfNodes.values());
    }
    public void addToMap(TreeNode root, int level){
        if(root == null) return ;
        addToMap(root.left, level+1);
        addToMap(root.right, level+1);
        ArrayList<Integer> currentLevel = mapOfNodes.getOrDefault(level, new ArrayList<>());
        currentLevel.add(root.val);
        mapOfNodes.put(level, currentLevel);
    }

}
