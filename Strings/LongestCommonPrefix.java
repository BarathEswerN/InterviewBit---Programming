public class Solution {
	public String longestCommonPrefix(ArrayList<String> a) {
	    if (a == null || a.size() < 1) {
	        return "";
	    }
	    
	    String lcp = a.get(0);
	    StringBuilder tmp = new StringBuilder();
	    
	    for (String str : a) {
	        tmp = new StringBuilder();
	        int length =  Math.min(str.length(), lcp.length());
	        for (int i = 0; i < length; i++) {
	            if (lcp.charAt(i) == str.charAt(i)) {
	               tmp.append(lcp.charAt(i));
	            }
	            else {
	                break;
	            }
	        }
	        lcp = tmp.toString();
	    }
	    
	    return lcp;
	}
}
