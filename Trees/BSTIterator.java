/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

public class Solution {
    Stack<TreeNode> st = new Stack<>();
    public Solution(TreeNode root) {
        while (root != null) {
            st.push(root);
            root = root.left;
        }
    }

    /** @return whether we have a next smallest number */
    public boolean hasNext() {
        return st.size() > 0;
    }

    /** @return the next smallest number */
    public int next() {
        int top = 0;
        if (!st.isEmpty()) {
            TreeNode next = st.pop();
            top = next.val;
            if (next.right != null) {
                next = next.right;
                st.push(next);
                while (next.left != null) {
                    next = next.left;
                    st.push(next);
                }
            }
        }
        return top;
    }
}

/**
 * Your Solution will be called like this:
 * Solution i = new Solution(root);
 * while (i.hasNext()) System.out.print(i.next());
 */
