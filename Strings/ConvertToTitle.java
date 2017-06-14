public class Solution {
	public String convertToTitle(int a) {
	    
	    Map<Integer, Character> alpMap = new HashMap<>();
	    int counter = 1;
	    
	    for (char i = 'A'; i <= 'Z'; i++) {
	        alpMap.put(counter, i);
	        counter++;
	    }
	    
	    Stack<Integer> st = new Stack<>();
	    
	    while (a > 26) {
	        int val = a % 26;
	        if (val == 0) {
	            val = 26;
	            a--;
	        }
	        st.push(val);
	        a /= 26;
	    }
	    
	    st.push(a);
	    
	    StringBuilder sb = new StringBuilder();
	    
	    while (st.size() > 0) {
	        sb.append(alpMap.get(st.pop()));
	    }
	    
	    return sb.toString();
	}
}
