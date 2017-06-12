public class Solution {
	public int reverse(int a) {
	    
	    boolean isNeg = false;
	    
	    if ( a < 0) {
	        isNeg = true;
	        a *= -1;
	    }
	    
	    long revInt = 0;
	    
	    while (a > 0) {
	        revInt = (revInt * 10) + (a % 10);
	        a /= 10;
	    }
	    
	    // Overflows
	    if (revInt > Integer.MAX_VALUE) {
	        return 0;
	    }
	    
	    if (isNeg) {
	        return (int)revInt * -1;
	    }
	    
	    return (int)revInt;
	}
}
