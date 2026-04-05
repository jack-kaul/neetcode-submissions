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
    public boolean isValidBST(TreeNode root) {
        boolean isValid = true;

        if(root.left == null && root.right == null) {
            return true;
        }

        if(root.left != null) {
            if(root.left.val >= root.val) {
                return false;
            } else {
                isValid = isValid && isValidBST(root.left);
            }
        }

        if(root.right != null) {
            if(root.right.val <= root.val) {
                return false;
            } else {
                isValid = isValid && isValidBST(root.right);
            }
        }

        return isValid;
    }
}
