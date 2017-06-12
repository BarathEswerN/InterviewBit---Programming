public class Solution {
	public String reverseWords(String a) {
	    if (a == null || a.length() < 1) {
	        return "";
	    }
	    
 	    StringBuilder tmp = new StringBuilder();
	    StringBuilder res = new StringBuilder();
	    
	    for (int i = 0; i < a.length(); i++) {
	        if (a.charAt(i) != ' ') {
	           tmp.append(a.charAt(i));
	        }
	        else {
	            res.append(tmp.reverse()+" ");
	            tmp = new StringBuilder();
	        }
	    }
	    
	    if (tmp.length() > 0) {
	        res.append(tmp.reverse());
	    }
	    else {
	        res.deleteCharAt(res.length() - 1);
	    }
	    
	    return res.reverse().toString();
	}
}
