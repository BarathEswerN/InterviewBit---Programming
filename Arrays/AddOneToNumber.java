public class Solution {
	public ArrayList<Integer> plusOne(ArrayList<Integer> a) {
	    
	    ArrayList<Integer> res = new ArrayList<>();
	    int carry = 1;
	    int sum = 0;
	    
	    for (int i = a.size() - 1; i >= 0; i--) {
	        sum = a.get(i) + carry;
	        carry = 0;
	        
	        if (sum == 10) {
	            sum = 0;
	            carry = 1;
	        }
	        
	        a.set(i, sum);
	    }
	    
	    if (carry > 0) {
	        res.add(1);
	    }
	    
	    for (int i = 0; i < a.size(); i++) {
	        if (a.get(i) == 0 && res.size() == 0)
	            continue;
	        res.add(a.get(i));
	    }
	   
	    return res;
	}
}
