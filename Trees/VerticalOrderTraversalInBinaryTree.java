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
    public ArrayList<ArrayList<Integer>> verticalOrderTraversal(TreeNode A) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
        if (A == null) {
            return res;
        }
        
        Map<Integer, ArrayList<Integer>> levelMap = new HashMap<Integer, ArrayList<Integer>>();
        
        Queue<TreeNode> treeQ = new LinkedList<TreeNode>();
        Queue<Integer> levelQ = new LinkedList<Integer>();
        int maxLength = 0;
        int minLength = 0;
        
        treeQ.offer(A);
        levelQ.offer(0);
        
        while (!treeQ.isEmpty()) {
            TreeNode tmp = treeQ.poll();
            int level = levelQ.poll();
            
            maxLength = Math.max(maxLength, level);
            minLength = Math.min(minLength, level);
            
            if (levelMap.containsKey(level)) {
                levelMap.get(level).add(tmp.val);
            }
            else {
                ArrayList<Integer> newList = new ArrayList<>();
                newList.add(tmp.val);
                levelMap.put(level, newList);
            }
            
            if (tmp.left != null) {
                treeQ.offer(tmp.left);
                levelQ.offer(level - 1);
            }
            
            if (tmp.right != null) {
                treeQ.offer(tmp.right);
                levelQ.offer(level + 1);
            }
        }
        
        for (int i = minLength; i <= maxLength; i++) {
            if (levelMap.containsKey(i)) {
                res.add(levelMap.get(i));
            }
        }
        
        return res;
    }
}
