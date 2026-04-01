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
    Stack<Integer> st;
    public int kthSmallest(TreeNode root, int k) {
        st = new Stack<>();
        getSortedElements(root, st);
        int size = st.size();
        for(int i = 0; i < size - k; i++) {
            st.pop();
        }

        return st.peek();
    }

    private void getSortedElements(TreeNode root, Stack<Integer> st) {  
        if (root == null) return;

        getSortedElements(root.left, st);
        st.add(root.val);  
        getSortedElements(root.right, st);
        return;
    }
}
