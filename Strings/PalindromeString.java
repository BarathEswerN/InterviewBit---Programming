public class Solution {
	public int isPalindrome(String a) {
	    int strt = 0;
	    int end = a.length() - 1;
	    
	    while (strt <= end) {
	        char t1 = '*';
	        char t2 = '*';
	        if (Character.isDigit(a.charAt(strt)) || Character.isLetter(a.charAt(strt))) {
	            t1 = a.charAt(strt);
	        } 
	        else {
	            while (strt <= end && (!Character.isDigit(a.charAt(strt)) && !Character.isLetter(a.charAt(strt)))) {
	                strt++;
	            }
	            if (strt <= end) {
	                t1 = a.charAt(strt);
	            }
	        }
	        
	        if (Character.isDigit(a.charAt(end)) || Character.isLetter(a.charAt(end))) {
	            t2 = a.charAt(end);
	        }
	        else {
	            while (end >= strt && (!Character.isDigit(a.charAt(end)) && !Character.isLetter(a.charAt(end)))) {
	                end--;
	            }
	            if (end >= strt) {
	                t2 = a.charAt(end);
	            }
	            
	        }
	        
	        if (Character.toLowerCase(t1) != Character.toLowerCase(t2)) {
	            return 0;
	        }
	        strt++;
	        end--;
	    }
	    
	    return 1;
	}
}
