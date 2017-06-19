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
	public ArrayList<Integer> preorderTraversal(TreeNode a) {
	    ArrayList<Integer> res = new ArrayList<>();
	    preorderTraversalHelper (a, res);
	    return res;
	}
	
	public void preorderTraversalHelper(TreeNode a, ArrayList<Integer> res) {
	    if (a == null) {
	        return;
	    }
	    
	    res.add(a.val);
	    preorderTraversalHelper(a.left, res);
	    preorderTraversalHelper(a.right, res);
	}
}
