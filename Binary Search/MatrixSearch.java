public class Solution {
	public int searchMatrix(ArrayList<ArrayList<Integer>> a, int b) {
	    if (a == null || a.size() < 1) {
	        return 0;
	    }
	    int rowPos = 0;
	    int colPos = a.get(0).size() - 1;
	    
	    while (rowPos < a.size() && colPos >= 0) {
	        if (a.get(rowPos).get(colPos) == b) {
	            return 1;
	        }
	        else if (a.get(rowPos).get(colPos) < b) {
	            rowPos++;
	        }
	        else {
	            colPos--;
	        }
	    }
	    
	    return 0;
	}
}
