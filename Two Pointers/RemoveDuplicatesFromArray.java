public class Solution {
	public int removeDuplicates(ArrayList<Integer> a) {
	    if (a == null || a.size() < 1) {
	        return 0;
	    }
	    if (a.size() == 1) {
	        return 1;
	    }
	    int i = 0;
	    int j = 1;
	    
	    while (i < a.size() && j < a.size()) {
	        if (a.get (i) - a.get(j) == 0) {
	            while (j < a.size() && (a.get(j) - a.get(i)) == 0) {
	                j++;
	            }
	            if (j < a.size()) {
	                 i++;
	                 a.set(i, a.get(j));
	            }
	                
	        }
	        else {
	            i++;
	            j++;
	        }
	    }
	    
	    return i + 1;
	}
}
