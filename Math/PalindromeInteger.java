public class Solution {
	public boolean isPalindrome(int a) {
	    if (a < 0) {
	        return false;
	    }
	    
	    int ans = 0;
	    int chk = a;
	    
	    while (a > 0) {
	        ans = (ans * 10) + (a % 10);
	        a /= 10;
	    }
	    
	    return (ans == chk) ? true : false;
	    
	}
}
