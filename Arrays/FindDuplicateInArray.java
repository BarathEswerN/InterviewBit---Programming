public class Solution {
	// DO NOT MODIFY THE LIST
	public int repeatedNumber(final List<Integer> a) {
	    HashSet<Integer> set = new HashSet<>();
	    
	    for (Integer i : a) {
	        if (set.contains(i)) {
	            return i;
	        }
	        set.add(i);
	    }
	    
	    return -1;
	}
}
