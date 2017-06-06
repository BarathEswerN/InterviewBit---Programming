public class Solution {
    
    public int segregate(ArrayList<Integer> a) {
        int j = 0;
        for (int i = 0; i < a.size(); i++) {
            if (a.get(i) <= 0) {
                int tmp = a.get(i);
                a.set(i, a.get(j));
                a.set(j, tmp);
                j++;
            }
        }
        
        return j;
    }
    
    
	public int firstMissingPositive(ArrayList<Integer> a) {
	    int shift = segregate(a);
	    int[] arr = new int[a.size() - shift];
	    int j = 0;
	    for (int i = shift; i < a.size(); i++) {
	        arr[j] = a.get(i);
	        j++;
	    }
	    

	    for (int i = 0; i < arr.length; i++) {
	        if (((Math.abs(arr[i]) - 1) < arr.length) && (arr[Math.abs(arr[i]) - 1] > 0)) {
	            arr[Math.abs(arr[i]) - 1] = -arr[Math.abs(arr[i]) - 1];
	        }
	    }
	    
	    for (int i = 0; i < arr.length; i++) {
	        if (arr[i] > 0) {
	            return i + 1;
	        }
	    }
	    
	    return arr.length + 1;
	}
}
