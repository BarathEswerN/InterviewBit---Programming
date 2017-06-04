public class Solution {
	public ArrayList<Integer> maxset(ArrayList<Integer> a) {
	    boolean isSkipped = false;
	    long currSum = 0;
	    int currStrt = 0;
	    int currLen = 0;
	    
	    long totalSum = 0;
	    int totalLength = 0;
	    int totalStrt = 0;
	    
	    for (int i = 0; i < a.size(); i++) {
	        if (a.get(i) < 0) {
	            if (currSum > totalSum) {
	                totalSum = currSum;
	                totalStrt = currStrt;
	                totalLength = currLen;
	            }
	            
	            else if (currSum == totalSum) {
	                if (currLen > totalLength) {
	                    totalSum = currSum;
	                    totalStrt = currStrt;
	                    totalLength = currLen;
	                }
	            }
	            currSum = 0;
	            currLen = 0;
	            currStrt = i + 1;
	        }
	        else {
	            currSum += a.get(i);
	            ++currLen;
	        }
	    }
	    
	    if (currSum > totalSum) {
            totalSum = currSum;
            totalStrt = currStrt;
            totalLength = currLen;
        }
        
        else if (currSum == totalSum) {
            if (currLen > totalLength) {
                totalSum = currSum;
                totalStrt = currStrt;
                totalLength = currLen;
            }
        }
	    
	    ArrayList<Integer> res = new ArrayList<>();
	    
	    for (int i = totalStrt; i < (totalStrt + totalLength); i++) {
	        res.add(a.get(i));
	    }
        return res;
	}
}
