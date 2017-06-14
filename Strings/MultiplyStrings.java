public class Solution {
	public String multiply(String a, String b) {
	    if (a.equals("0") || b.equals("0")) {
	        return "0";
	    }
	    
	    a = new StringBuilder(a).reverse().toString();
	    b = new StringBuilder(b).reverse().toString();
	    
	    int[] mul = new int[a.length() + b.length()];
	    
	    for (int i = 0; i < a.length(); i++) {
	        for (int j = 0; j < b.length(); j++) {
	            mul[i + j] += (a.charAt(i) - '0') * (b.charAt(j) - '0');
	        }
	    }
	    
	    StringBuilder prod = new StringBuilder();
	    int carry = 0;
	    int sum = 0;
	    for (int i = 0; i < mul.length; i++) {
	        sum = mul[i];
	        prod.append(sum % 10);
	        carry = sum / 10;
	        if (i + 1 < mul.length) {
	            mul[i + 1] += carry;
	        }
	    }
	    
	    if (carry > 0) {
	        prod.append(carry);
	    }
	    prod = prod.reverse();
	    while (prod.charAt(0) == '0') {
	        prod.deleteCharAt(0);
	    }
	    return prod.toString();
	    
	}
}
