public class Solution {
	public int romanToInt(String a) {
	    
	    if (a == null || a.length() < 1) {
	        return 0;
	    }
	    
	    Map<Character, Integer> romanMap = new HashMap<>();
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);
        
	    int len = a.length();
	    int curr = 0;
	    int prev = 0;
	    for (int i = len - 1; i >= 0; i--) {
	        int tmp = romanMap.get(a.charAt(i));
	        if (tmp >= prev) {
	            curr += tmp;
	            prev = tmp;
	        }
	        else {
	            curr -= tmp;
	        }
	    }
	    
	    return curr;
	}
}
