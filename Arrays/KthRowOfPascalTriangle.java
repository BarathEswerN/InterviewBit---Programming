public class Solution {
	public ArrayList<Integer> getRow(int a) {
	    ArrayList<Integer> res = new ArrayList<>();
	    ArrayList<Integer> prev = new ArrayList<>();
        prev.add(1);
	    for (int i = 0; i <= a; i++) {
	        res = new ArrayList<>();
	        for (int j = 0; j <= i; j++) {
	            if (j == 0 || j == i) {
	                res.add(1);
	            }
	            else {
	                int val = prev.get(j - 1) + prev.get(j);
	                res.add(val);
	            }
	        }
	        prev = res;
	    }
	    
	    return res;
	}
}
