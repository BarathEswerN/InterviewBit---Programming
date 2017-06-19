public class Solution {
	public int strStr(final String haystack, final String needle) {
	    if(needle == null || needle.length() < 1) {
	        return 0;
	    }
	    if (haystack.equals(needle)) {
	        return 0;
	    }
	    
	    int window = needle.length();
	    
	    for (int i = 0; i < haystack.length(); i++) {
	        if ((i + window) > haystack.length()) {
	            return -1;
	        }
	        if (haystack.charAt(i) == needle.charAt(0)) {
	            int index = i;
	            for (int j = 0; j < needle.length(); j++) {
	                if (haystack.charAt(index) == needle.charAt(j)) {
    	                if (j == needle.length() - 1) {
    	                    return i;
    	                }
    	                index++;
	                }
	                else {
	                    break;
	                }
	            }
	        }
	    }
	    return -1;
	}
}
