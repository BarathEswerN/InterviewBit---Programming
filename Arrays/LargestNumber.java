public class Solution {
	// DO NOT MODIFY THE LIST
	public String largestNumber(final List<Integer> a) {
	    
	    PriorityQueue<String> pq = new PriorityQueue<>(new Comparator<String>() {
	       public int compare(String a, String b) {
	           String fe = a + b;
	           String se =  b + a;
	           
	           return se.compareTo(fe);
	       } 
	    });
	    
	    for (Integer x : a) {
	        pq.offer(String.valueOf(x));
	    }
	    StringBuilder sb = new StringBuilder();
	    long sum = 0;
	    
	    while (!pq.isEmpty()) {
	        sb.append(pq.peek());
	        sum += Integer.parseInt(pq.poll());
	    }
	    
	    return (sum == 0) ? "0" : sb.toString(); 
	}
}
