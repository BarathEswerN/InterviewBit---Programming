public class Solution {
	public void merge(ArrayList<Integer> a, ArrayList<Integer> b) {
	    int i = a.size() - 1;
	    int j = b.size() - 1;
	    int m = a.size();
	    int n = b.size();
	    int k = 1;
	    
	    for (int q = a.size(); q < m + n; q++) {
	        a.add(0);
	    }
	    
	    while (i >= 0 && j >= 0) {
	        if (a.get(i) >= b.get(j)) {
	            a.set(m + n - k, a.get(i));
	            i--;
	        }
	        else {
	            a.set(m +n - k, b.get(j));
	            j--;
	        }
	        k++;
	    }
	    
	    if (i >= 0) {
	        while (i >= 0) {
	            a.set(m + n - k, a.get(i));
	            i--;
	            k++;
	        }
	    }
	    
	    else if (j >= 0) {
	        while (j >= 0) {
	            a.set(m + n - k, b.get(j));
	            j--;
	            k++;
	        }
	    }
	    return;
	}
}
