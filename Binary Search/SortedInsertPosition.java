public class Solution {
	public int searchInsert(ArrayList<Integer> a, int b) {
	    if (a == null || a.size() < 1) {
	        return 0;
	    }
	    
	    int low = 0; 
	    int high = a.size() - 1;
	    
	    while (low <= high) {
	        int mid = (low + high) / 2;
	        if (a.get(mid) == b) {
	            return mid;
	        }
	        else if (a.get(mid) > b) {
	            high = mid - 1;
	        }
	        else {
	            low = mid + 1;
	        }
	    }
	    
	    return low;
	}
}
