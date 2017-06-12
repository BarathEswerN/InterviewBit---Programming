public class Solution {
	public int sqrt(int a) {
	    if (a == 0 || a == 1) {
	        return a;
	    }
	    
	    long low = 0;
	    long high = a;
	    
	    while (low < high) {
	        long mid = (low + high) / 2;
	        long square = mid * mid;
	        if (square == a) {
	            return (int)mid;
	        }
	        else if (low == (high - 1)) {
	            return (int) low;
	        }
	        else if (square > a) {
	            high =  mid;
	        }
	        else {
	            low =  mid;
	        }
	    }
	    
	    return (int)low;
	}
}
