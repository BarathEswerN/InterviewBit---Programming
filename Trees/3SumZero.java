public class Solution {
	public ArrayList<ArrayList<Integer>> threeSum(ArrayList<Integer> a) {
	    ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
	    if (a == null || a.size() < 3) {
	        return res;
	    }
	    Collections.sort(a);
	    
	    for (int i = 0; i < a.size(); i++) {
	        if ((i == 0) || (a.get(i) - a.get(i - 1) != 0)) {
    	        int target = a.get(i);
    	        int j = i + 1;
    	        int k = a.size() - 1;
    	        
    	        while (j < k) {
    	            int sum = target + a.get(j)+ a.get(k);
    	            if (sum == 0) {
    	                ArrayList<Integer> level = new ArrayList<>();
    	                level.add(target);
    	                level.add(a.get(j));
    	                level.add(a.get(k));
    	                res.add(level);
    	                
    	                k--;
    	                j++;
    	                
    	                while ((k > j) && (a.get(k) - a.get(k + 1) == 0)) {
    	                    k--;
    	                }
    	                
    	                while ((j < k) && (a.get(j) - a.get(j - 1) == 0)) {
    	                    j++;
    	                }
    	            }
    	            
    	            else if (sum < 0) {
    	                j++;
    	            }
    	            else {
    	                k--;
    	            }
    	        }
	        }
	    }
	    
	    return res;
	}
}
