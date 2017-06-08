public class Solution {
	// DO NOT MODIFY THE LIST
	public int maximumGap(final List<Integer> a) {
	    int n = a.size();
	    int[] leftMin = new int[n];
	    int[] rightMax = new int[n];
	    
	    leftMin[0] = a.get(0);
	    
	    for (int i = 1; i < n; i++) {
	        leftMin[i] = Math.min(a.get(i), leftMin[i - 1]);
	    }
	    
	    rightMax[n - 1] = a.get(n - 1);
	    
	    for (int i = n - 2; i >= 0; i--) {
	        rightMax[i] = Math.max(rightMax[i + 1], a.get(i));
	    }
	    
	    int i = 0, j = 0, maxDiff = 0;
	    
	    while (i < n && j < n) {
	        if (leftMin[i] <= rightMax[j]) {
	            maxDiff = Math.max(maxDiff, j - i);
	            j++;
	        }
	        else {
	            i++;
	        }
	    }
	    
	    return maxDiff;
	}
}
