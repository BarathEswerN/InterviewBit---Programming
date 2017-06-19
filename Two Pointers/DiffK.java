public class Solution {
	public int diffPossible(ArrayList<Integer> a, int b) {
	    int i = 0;
	    int j = 1;
	    
	    while (i < a.size() && j < a.size()) {
	       
	        if (i != j && a.get(j) - a.get(i) == b) {
	            return 1;
	        }
	        else if (a.get(j) - a.get(i) < b) {
	            j++;
	        }
	        else {
	            i++;   
	        }
	    }
	    
	    return 0;
	}
}
