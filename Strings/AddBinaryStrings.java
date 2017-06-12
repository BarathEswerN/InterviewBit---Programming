public class Solution {
	public String addBinary(String a, String b) {
	    a = new StringBuilder(a).reverse().toString();
	    b = new StringBuilder(b).reverse().toString();
	    
	    StringBuilder sb = new StringBuilder();
	    int i = 0;
	    int j = 0;
	    int carry = 0;
	    
	    while (i < a.length() || j < b.length()) {
	        if (i < a.length()) {
	            int tmp = a.charAt(i) - '0';
	            carry += tmp;
	            i++;
	        }
	        if (j < b.length()) {
	            int tmp = b.charAt(j) - '0';
	            carry += tmp;
	            j++;
	        }
	        
	        if (carry == 0 || carry == 1) {
	            sb.append(carry);
	            carry = 0;
	        }
	        else  {
	            sb.append(carry - 2);
	            carry = 1;
	        }
	    }
	    if (carry > 0) {
	        sb.append('1');
	    }
	    return sb.reverse().toString();
	}
}
