public class Solution {
	public int titleToNumber(String a) {
	    Map<Character, Integer> alpMap = new HashMap<>();
	    int counter = 1;
	    for (char i = 'A'; i <='Z'; i++) {
	        alpMap.put(i, counter);
	        counter++;
	    }
	    
	    int len = a.length();
	    int excelNum = 0;
	    
	    for (int i = len - 1; i >= 0; i--) {
	        char tmp = a.charAt(i);
	        int charVal = alpMap.get(tmp);
	        excelNum += charVal * Math.pow(26, len - 1 - i);
	    }
	    
	    return excelNum;
	}
}
