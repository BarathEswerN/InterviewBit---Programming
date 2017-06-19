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
	public int isBalanced(TreeNode a) {
	    if (a == null) {
	        return 1;
	    }
	    int ld = height(a.left);
	    int rd = height(a.right);
	    
	    if (Math.abs(ld - rd) <= 1 && isBalanced(a.left) == 1 && isBalanced(a.right) == 1) {
	        return 1;
	    }
	    return 0;
	}
	
	public int height(TreeNode a) {
	    if (a == null) {
	        return 0;
	    }
	    
	    return 1 + Math.max(height(a.left), height(a.right));
	}
}
