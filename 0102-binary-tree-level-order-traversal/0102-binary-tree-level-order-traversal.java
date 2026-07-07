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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if(root == null){
            return res;
        }
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            List<Integer> level = new ArrayList<>();
            int levelSize = q.size();
            for(int i = 0; i<levelSize; i++){
                TreeNode element = q. remove();
                level.add(element.val);
                if(element.left != null){
                    q.add(element.left);
                }
                if(element.right != null){
                    q.add(element.right);
                }
                
            }
            res.add(level);
        }
       return res; 
    }
}