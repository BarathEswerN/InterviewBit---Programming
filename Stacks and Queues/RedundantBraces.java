public class Solution {
	public int braces(String a) {
	    if (a == null || a.length() < 1) {
	        return 0;
	    }
	    Stack<Character> st= new Stack<>();
	    st.push(a.charAt(0));
	    int i = 1;
	    
	    while (i < a.length()) {
	        if (a.charAt(i) == ')') {
	           int counter = 0;
	           while (!st.isEmpty() && st.peek() != '(') {
	               counter++;
	               st.pop();
	           }
               st.pop();
	           if(counter < 2) {
	               return 1;
	           }
	        }
	        else {
	            st.push(a.charAt(i));
	        }
	        i++;
	    }
	    
	    return 0;
	}
}
