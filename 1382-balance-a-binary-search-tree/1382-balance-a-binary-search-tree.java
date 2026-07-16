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
    ArrayList<Integer> result = new ArrayList<>();
    public TreeNode balanceBST(TreeNode root) {
       
        inorder(root);
        return helper(result,0, result.size()-1);

    }
    void inorder(TreeNode root){
        if(root == null){
            return;
        }
        inorder(root.left);
        result.add(root.val);
        inorder(root.right);

    }
    TreeNode helper(ArrayList<Integer> nums, int l, int r){
        if(l>r) return null;

        int mid = (l+r)/2;
        TreeNode root = new TreeNode(nums.get(mid));
        root.left = helper(nums, l, mid-1);
        root.right = helper(nums, mid+1, r);
        return root;
    }
}