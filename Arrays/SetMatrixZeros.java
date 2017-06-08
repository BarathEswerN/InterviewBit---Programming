public class Solution {
	public void setZeroes(ArrayList<ArrayList<Integer>> a) {
	    boolean isFirstRowZero = false;
	    boolean isFirstColZero = false;
	    
	    for (int i = 0; i < a.get(0).size(); i++) {
	        if (a.get(0).get(i) == 0) {
	            isFirstRowZero = true;
	            break;
	        }
	    }
	    
	    for (int i = 0; i < a.size(); i++) {
	        if (a.get(i).get(0) == 0) {
	            isFirstColZero = true;
	            break;
	        }
	    }
	    
	    for (int i = 1; i < a.size(); i++) {
	        for (int j = 1; j < a.get(0).size(); j++) {
	            if (a.get(i).get(j) == 0) {
	                a.get(i).set(0, 0);
	                a.get(0).set(j, 0);
	            }
	        }
	    }
	    
	    for (int i = 1; i < a.size(); i++) {
	        for (int j = 1; j < a.get(i).size(); j++) {
	            if (a.get(i).get(0) == 0 || a.get(0).get(j) == 0) {
	                a.get(i).set(j, 0);
	            }
	        }
	    }
	    
	    if (isFirstColZero) {
	        for (int i = 0; i < a.size(); i++) {
	            a.get(i).set(0, 0);
	        }
	    }
	    
	    if (isFirstRowZero) {
	        for (int i = 0; i < a.get(0).size(); i++) {
	            a.get(0).set(i, 0);
	        }
	    }
 	    return;
	}
}
