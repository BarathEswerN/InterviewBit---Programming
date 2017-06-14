public class Solution {
	public ArrayList<Integer> wave(ArrayList<Integer> a) {
	    
	    Collections.sort(a);
	    int i = 1;
	    
	    while (i < a.size()) {
	        int tmp = a.get(i - 1);
	        a.set(i - 1, a.get(i));
	        a.set(i, tmp);
	        i += 2;
	    }
	    
	    return a;
	}
}
