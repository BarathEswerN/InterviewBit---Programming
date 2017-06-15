/**
 * Definition for binary tree with next pointer.
 * public class TreeLinkNode {
 *     int val;
 *     TreeLinkNode left, right, next;
 *     TreeLinkNode(int x) { val = x; }
 * }
 */
public class Solution {
    public void connect(TreeLinkNode root) {
        if (root == null) {
            return;
        }
        
        Queue<TreeLinkNode> q = new LinkedList<TreeLinkNode>();
        q.offer(root);
        q.offer(null);
        
        while (!q.isEmpty()) {
            TreeLinkNode tmp = q.poll();
            
            if (tmp == null) {
                if (q.size() > 0) {
                    q.offer(null);
                }
            }
            else {
                tmp.next = q.peek();
                
                if (tmp.left != null) {
                    q.offer(tmp.left);
                }
                
                if (tmp.right != null) {
                    q.offer(tmp.right);
                }
            }
        }
        
        return;
    }
}
