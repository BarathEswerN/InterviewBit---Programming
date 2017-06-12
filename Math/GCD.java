public class Solution {
	public int gcd(int a, int b) {
	    if (a == 0 && b == 0) {
	        return 0;
	    }
	    if (a == 0) {
	        return b;
	    }
	    if (b == 0) {
	        return a;
	    }
	    
	    return gcd(b, (a % b));
	}
}
