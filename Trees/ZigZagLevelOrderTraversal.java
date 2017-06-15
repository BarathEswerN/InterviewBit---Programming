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
	public ArrayList<ArrayList<Integer>> zigzagLevelOrder(TreeNode a) {
	    ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
	    if (a == null) {
	        return res;
	    }
	    
	    Stack<TreeNode> st1 = new Stack<>();
	    Stack<TreeNode> st2 = new Stack<>();
	    
	    st1.push(a);
	    
	    while (!st1.isEmpty() || !st2.isEmpty()) {
	        ArrayList<Integer> level = new ArrayList<>();
	        if (!st1.isEmpty()) {
	            while (!st1.isEmpty()) {
	                TreeNode tmp = st1.pop();
	                if (tmp.left != null) {
	                    st2.push(tmp.left);
	                }
	                if (tmp.right != null) {
	                    st2.push(tmp.right);
	                }
	                level.add(tmp.val);
	            }
	            res.add(level);
	        }
	        
	        if (!st2.isEmpty()) {
	            level = new ArrayList<>();
	            while (!st2.isEmpty()) {
	                TreeNode tmp = st2.pop();
	                if (tmp.right != null) {
	                    st1.push(tmp.right);
	                }
	                if (tmp.left != null) {
	                    st1.push(tmp.left);
	                }
	                level.add(tmp.val);
	            }
	            res.add(level);
	        }
	    }
	    
	    return res;
	}
}
