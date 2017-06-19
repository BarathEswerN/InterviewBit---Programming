public class Solution {
	public void sortColors(ArrayList<Integer> a) {
	    
	    if (a == null || a.size() < 2) {
	        return;
	    }
	    
	    int zeroCount = 0;
	    int oneCount = 0;
	    
	    for (int i = 0; i < a.size(); i++) {
	        if (a.get(i)  == 0) {
	            zeroCount++;
	        }
	        else if (a.get(i) - 1 == 0) {
	            oneCount++;
	        }
	        a.set(i, 2);
	    }
	    
	    for (int i = 0; i < zeroCount; i++) {
	        a.set(i, 0);
	    }
	    
	    for (int i = zeroCount; i < zeroCount + oneCount; i++) {
	        a.set(i, 1);
	    }
	    
	    return;
	}
}
