public class Solution {
	// DO NOT MODIFY THE LIST
	public ArrayList<Integer> repeatedNumber(final List<Integer> a) {
	    
	    int[] arr = new int[a.size()];
	    ArrayList<Integer> res = new ArrayList<>();
	    
	    for (int i = 0; i < a.size(); i++) {
	        arr[i] = a.get(i);
	    }
	    
	    for (int i = 0; i < arr.length; i++) {
	        if (arr[Math.abs(arr[i]) - 1] > 0) {
	            arr[Math.abs(arr[i]) - 1] = -arr[Math.abs(arr[i]) - 1];
	        }
	        else {
	            res.add(Math.abs(arr[i]));
	        }
	    }
	    
	    for (int i = 0; i < arr.length; i++) {
	        if (arr[i] > 0) {
	            res.add(i+1);
	        }
	    }
	    
	    return res;
	}
}
