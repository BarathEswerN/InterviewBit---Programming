public class Solution {
	public int trailingZeroes(int a) {
	    int fiveCount = 5;
	    int trailZeros = 0;
	    
	    while (fiveCount <= a) {
	        trailZeros += a / fiveCount;
	        fiveCount *= 5;
	    }
	    
	    return trailZeros;
	}
}
