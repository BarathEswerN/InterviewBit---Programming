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
	public int maxDepth(TreeNode a) {
	    if (a == null) {
	        return 0;
	    }
	    
	    int leftDpth = maxDepth(a.left);
	    int rightDpth = maxDepth(a.right);
	    
	    return 1 + Math.max(leftDpth, rightDpth);
	}
}
