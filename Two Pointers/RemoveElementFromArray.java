public class Solution {
	public int removeElement(ArrayList<Integer> a, int b) {
	    if (a == null || a.size() < 1) {
	        return 0;
	    }
	    
	    int len = 0;
	    int finalTemp = -1;
	    
	    for (int i = 0; i < a.size(); i++) {
	        if (a.get(i) == b) {
                int temp = i;
                if (finalTemp != -1) {
                    temp = finalTemp;
                }
                while (temp < a.size() && a.get(temp) == b) {
                    temp++;
                }
                finalTemp = temp + 1;
                if (temp < a.size()) {
                    int swap = a.get(temp);
                    a.set(temp, a.get(i));
                    a.set(i, swap);
                }
                else {
                    return len;
                }
	        }
	        
	        len = i + 1;
	    }
	    
	    return len;
	}
}
