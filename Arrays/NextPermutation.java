public class Solution {
    public void reverse(ArrayList<Integer> a, int strt, int end) {
        while (strt < end) {
    	       int temp = a.get(strt);
    	       a.set(strt, a.get(end));
    	       a.set(end, temp);
    	       strt++;
    	       end--;
    	   }
    	   return;
    }
    
	public void nextPermutation(ArrayList<Integer> a) {
	    
	    if (a == null || a.size() < 2) {
	        return;
	    }
	    
	   int firstSmlInd = 0;
	   int firstLrgInd = 0;
	   
	   for (int i = a.size() - 2; i >= 0; i--) {
	       if (a.get(i) < a.get(i + 1)) {
	           firstSmlInd = i;
	           break;
	       }
	   }
	   
	   for (int i = a.size() - 1; i > firstSmlInd; i--){
	       if (a.get(i) > a.get(firstSmlInd)) {
	           firstLrgInd = i;
	           break;
	       }
	   }
	   
	   if (firstSmlInd == 0 && firstLrgInd == 0) {
           int strt = 0; 
	       int end = a.size() - 1;
	       reverse(a, strt, end);
	       return;
	   }
	   
	   int tmp = a.get(firstSmlInd);
	   a.set(firstSmlInd, a.get(firstLrgInd));
	   a.set(firstLrgInd, tmp);
	   
	   int strt = firstSmlInd + 1; 
	   int end = a.size() - 1;
	   
	   reverse(a, strt, end);
	   
	   return;
	}
}
