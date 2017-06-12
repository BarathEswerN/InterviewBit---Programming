public class Solution {
	// DO NOT MODIFY THE LIST
	public int search(final List<Integer> a, int b) {
	    if (a == null || a.size() < 1) {
	        return -1;
	    }
	    
	    int low = 0;
	    int high = a.size() - 1;
	    
	    while (low <= high) {

	        int mid = (low + high) / 2;
	        
	        if (a.get(mid) == b) {
	            return mid;
	        }
	        
	        else if (a.get(mid) >= a.get(0)) {
	            //1st half is sorted
	            if (b < a.get(mid) && b >= a.get(0)) {
	                high = mid - 1;
	            }
	            else {
	                low = mid + 1;
	            }
	        }
	        
	        else {
	            // 2nd half is sorted
	            if (b > a.get(mid) && b <= a.get(a.size() - 1)) {
	                low = mid + 1;
	            }
	            else {
	                high = mid - 1;
	            }
	        }
	    }
	    
	    return -1;
	}
}
