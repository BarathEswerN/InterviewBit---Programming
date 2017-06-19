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
	public int minDepth(TreeNode a) {
	    if (a == null) {
	        return 0;
	    }
	    
	    Queue<TreeNode> q1 = new LinkedList<TreeNode>();
	    Queue<Integer> q2 = new LinkedList<Integer>();
	    
	    q1.offer(a);
	    q2.offer(1);
	    
	    while (!q1.isEmpty()) {
	        TreeNode temp = q1.poll();
	        int count = q2.poll();
	        
	        if (temp.left == null && temp.right == null) {
	            return count;
	        }
	        
	        if (temp.left != null) {
	            q1.offer(temp.left);
	            q2.offer(count + 1);
	        }
	        
	        if (temp.right != null) {
	            q1.offer(temp.right);
	            q2.offer(count + 1);
	        }
	    }
	    
	    return 0;
	}
}
