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
	public ArrayList<Integer> postorderTraversal(TreeNode a) {
	    ArrayList<Integer> res = new ArrayList<>();
	    postOrderHelper(a, res);
	    return res;
	}
	
	public void postOrderHelper(TreeNode a, ArrayList<Integer> res) {
	    if (a == null) {
	        return;
	    }
	    
	    postOrderHelper(a.left, res);
	    postOrderHelper(a.right, res);
	    res.add(a.val);
	}
}
