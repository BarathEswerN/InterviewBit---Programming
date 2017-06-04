public class Solution {
	// DO NOT MODFIY THE LIST. 
	public int maxSubArray(final List<Integer> a) {
	    if (a == null || a.size() == 0) {
	        return 0;
	    }
	    int sumSoFar = a.get(0);
	    int totalSum = a.get(0);
	    
	    for (int  i = 1; i < a.size(); i++) {
	        sumSoFar = Math.max((sumSoFar + a.get(i)), a.get(i));
	        totalSum = Math.max(totalSum, sumSoFar);
	    }
	    
	    return totalSum;
	}
}
