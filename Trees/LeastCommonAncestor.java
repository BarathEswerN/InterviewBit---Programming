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
	public int lca(TreeNode a, int val1, int val2) {
	    if (!find(a, val1) || !find(a, val2)) {
	        return -1;
	    }
	    
	    TreeNode ans = lcsHelper(a, val1, val2);
	    
	    return ans != null ? ans.val : -1;
	}
	
	public boolean find(TreeNode root, int val) {
	    if (root == null) {
	        return false;
	    }
	    
	    if (root.val == val) {
	        return true;
	    }
	    
	    return find(root.left, val) || find(root.right, val);
	}
	
	public TreeNode lcsHelper(TreeNode a, int val1, int val2) {
	    if (a == null) {
	        return null;
	    }
	    
	    if (a.val == val1 || a.val == val2) {
	        return a;
	    }
	    
	    TreeNode left = lcsHelper (a.left, val1, val2);
	    TreeNode right = lcsHelper (a.right, val1, val2);
	    
	    if (left != null && right != null) {
	        return a;
	    }
	    return left == null ? right : left;
	}
}
