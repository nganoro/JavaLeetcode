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
//class Solution {
//    public boolean hasPathSum(TreeNode root, int targetSum) {
//        if(root == null){
//            return false;
//        } else if((root.left == null && root.right == null) && root.val == targetSum){
//            return true;
//        } else {
//            return hasPathSum(root.left, targetSum - root.val) || hasPathSum(root.right, targetSum - root.val);
//        }
//    }
//}

/** if a conditional recursive loop, the earlier if n else conditions,
 * check if the requirments are met and if the loop can be terminated which are called a base case
 * and prolly the last if n else conditions are where you call the method again
 * by modifiting the parameters that are sent which are called the recusiver calls
 */