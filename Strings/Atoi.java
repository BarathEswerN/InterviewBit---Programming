public class Solution {
	public int atoi(final String a) {
	    if (a == null || a.length() < 1) {
	        return 0;
	    }
	    int strt = 0;
	    boolean isNeg = false;
	    
	    for(int i = 0; i < a.length(); i++) {
	        if (a.charAt(i) != ' ') {
	            strt = i;
	            break;
	        }
	    }
	    
	    if (a.charAt(strt) == '-') {
	        isNeg = true;
	        strt++;
	    }
	    else if (a.charAt(strt) == '+') {
	        strt++;
	    }
	    
	    double result = 0;
	    
	    while ((strt < a.length() && a.charAt(strt) >= '0' && a.charAt(strt) <= '9')) {
	        result = (result * 10) + (double) (a.charAt(strt) - '0');
	        strt++;
	    }
	    
	    if (isNeg) {
	        if (-result < Integer.MIN_VALUE) {
	            return Integer.MIN_VALUE;
	        }
	        result *= -1;
	        return (int)result;
	    }
	    
	    if (result > Integer.MAX_VALUE) {
	        return Integer.MAX_VALUE;
	    }
	    
	    return (int) result;
	}
}
