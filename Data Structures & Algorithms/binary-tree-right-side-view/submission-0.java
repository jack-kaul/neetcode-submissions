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
    final Integer dummyVal = 999;

    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();

        if(root == null) return result;

        TreeNode dummy = new TreeNode(dummyVal);
        q.add(root);
        q.add(dummy);

        while(q.size() > 1) {
            result.add(q.peek().val);

            while(q.peek().val != dummyVal.intValue()) {
                TreeNode curr = q.remove();

                if(curr.right != null) {
                    q.add(curr.right);
                }

                if(curr.left != null) {
                    q.add(curr.left);
                }
            }
            q.remove();
            q.add(dummy);
        }

        return result;
    }
}
