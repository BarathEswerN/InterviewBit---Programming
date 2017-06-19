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
	public ArrayList<Integer> inorderTraversal(TreeNode a) {
	    ArrayList<Integer> res = new ArrayList<>();
	    inorderTraversalHelper(a, res);
	    return res;
	}
	
	public void inorderTraversalHelper(TreeNode a, ArrayList<Integer> res) {
	    if (a == null) {
	        return;
	    }
	    
	    inorderTraversalHelper(a.left, res);
	    res.add(a.val);
	    inorderTraversalHelper(a.right, res);
	}
}
