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
    public int goodNodes(TreeNode root) {
        if(root == null) return 0;
        return countGoodNodes(root, -999);
    }

    public int countGoodNodes(TreeNode node, int max) {
        int goodNodes = 0;
        if(node.val >= max) {
            max = node.val;
            goodNodes += 1;
        }

        if(node.left != null) {
            goodNodes += countGoodNodes(node.left, max);
        }

        if(node.right != null) {
            goodNodes += countGoodNodes(node.right, max);
        }

        return goodNodes;
    }
}
