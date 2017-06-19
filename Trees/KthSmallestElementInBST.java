/**
 * Definition for binary tree
 * class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public int kthsmallest(TreeNode root, int k) {
        if (root == null) {
            return 0;
        }
        Stack<TreeNode> st = new Stack<>();

        while ((root != null) || !st.isEmpty()) {
            if (root != null) {
                st.push(root);
                root = root.left;
            }    
            else {
                TreeNode top = st.pop();
                k--;
                if (k == 0) {
                    return top.val;
                }
                root = top.right;
            }
        }
        
        return root.val;
    }
}
