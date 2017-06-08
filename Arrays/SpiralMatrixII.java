public class Solution {
	public ArrayList<ArrayList<Integer>> generateMatrix(int a) {
	    
	    int n = a * a;
	    ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>(a);
	    
	    for (int i = 0; i < a; i++) {
	    	ArrayList<Integer>tmp = new ArrayList<>(a);
	    	for (int j= 0; j < a; j++) {
	    		tmp.add(0);
	    	}
	    	res.add(tmp);
	    }
	    
	    
	    int i = 0, j = 0,  count = 1;
	    int track = 1;
	    while (count <= n) {
	        i = track - 1;
	       
	        for (j = track - 1; j <= a - track; j++) {
	            res.get(i).set(j, count);
	            count++;
	        }
	        j = a - track;
	        
	        for (i = track; i <= a - track; i++) {
	        	res.get(i).set(j, count);
	        	count++;
	        }
	        
	        i = a - track;
	        for (j = a - track - 1; j >= track - 1; j--) {
	        	res.get(i).set(j, count);
	        	count++;
	        }
	        
	        j = track - 1;
	        for (i = a - track - 1; i >= track; i--) {
	        	res.get(i).set(j, count);
	        	count++;
	        }
	        track++;
	        
	    }
		return res;
	
	}
}
