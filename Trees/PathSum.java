/**
 * Definition for binary tree
 * class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeN de right;                 fv c   
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
	public int hasPathSum(TreeNode root, int b) {
	    if (root == null) {
	        return 0;
	    }
	    if (root.left == null && root.right == null && root.val == b) {
	        return 1;
	    }
	    
	    if (hasPathSum(root.left, b - root.val) == 1 || hasPathSum(root.right, b - root.val) == 1) {
	        return 1;
	    }
	    return 0;
	}
}
