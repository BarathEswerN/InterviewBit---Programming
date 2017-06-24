public class Solution {
	// DO NOT MODIFY THE LISTS
	public ArrayList<Integer> intersect(final List<Integer> a, final List<Integer> b) {
	    ArrayList<Integer> res = new ArrayList<>();
	    if (a == null || b == null) {
	        return res;
	    }
	    
	    int i = 0;
	    int j = 0;
	    
	    while (i < a.size() && j < b.size()) {
	        int m = a.get(i);
	        int n = b.get(j);
	        if (m == n) {
	            res.add(a.get(i));
	            i++;
	            j++;
	        }
	        else if (m < n) {
	            i++;
	        }
	        else {
	            j++;
	        }
	    }
	    return res;
	}
}
