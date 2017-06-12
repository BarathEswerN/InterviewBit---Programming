public class Solution {
	public String intToRoman(int a) {
	    int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
	    String[] roman = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
	    StringBuffer sb = new StringBuffer();
	    
	    for (int i = 0; i < values.length; i++) {
	        while (a >= values[i]) {
	            a -= values[i];
	            sb.append(roman[i]);
	        }
	    }
	    
	    return sb.toString();
	}
}
