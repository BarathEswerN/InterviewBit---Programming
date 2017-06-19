public class Solution {
	public int threeSumClosest(ArrayList<Integer> a, int b) {
	    if (a == null || a.size() < 3) {
	        return 0;
	    }
	    Collections.sort(a);
	    int min = Integer.MAX_VALUE;
	    int result = 0;
	    
	    for (int i = 0; i < a.size(); i++) {
	        int target = a.get(i);
	        int j = i + 1;
	        int k = a.size() - 1;
	        
	        while (j < k) {
	            int sum = target + a.get(j) + a.get(k);
	            int diff = Math.abs(b - sum);
	            if (diff == 0) {
	                return sum;
	            }
	            if (diff < min) {
	                min = diff;
	                result = sum;
	            }
	            if (sum < b) {
	                j++;
	            }
	            else {
	                k--;
	            }
	        }
	    }
	    
	    return result;
	}
}
