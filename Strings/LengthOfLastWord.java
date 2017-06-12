public class Solution {
	public int lengthOfLastWord(final String a) {
	    if (a == null || a.length() < 1) {
	        return 0;
	    }
	    
	    int length = a.length();
	    int spcCount = 0;
	    
	    for (int i = length - 1; i >= 0; i--) {
	        if (a.charAt(i) == ' ') {
	            spcCount++;
	        }
	        else {
	            break;
	        }
	    }
	    
	    int actLen = length - spcCount;
	    int lastCount = 0;
	    
	    for (int i = actLen - 1; i >= 0; i--) {
	        if (a.charAt(i) != ' ') {
	            lastCount++;
	        }
	        else {
	            break;
	        }
	    }
	    
	    return lastCount;
	}
}
