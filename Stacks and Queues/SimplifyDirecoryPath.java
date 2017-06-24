public class Solution {
	public String simplifyPath(String path) {
	    if (path == null || path.length() < 1) {
            return "/";
        }
        
        Stack<String> st = new Stack<>();
        String[] arr = path.split("/");
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(".") || arr[i].length() < 1) {
                continue;
            }
            else if (arr[i].equals("..")) {
                if (st.size() > 0) {
                    st.pop();
                }
            }
            else {
                st.push(arr[i]);
            }
        }
        
        StringBuilder sb = new StringBuilder();
        Stack<String> st2 = new Stack<>();
        
        while (!st.isEmpty()) {
            st2.push("/"+st.pop());
        }
        
        while (!st2.isEmpty()) {
            sb.append(st2.pop());
        }
        
        return (sb.length() == 0) ? "/" : sb.toString();
	}
}
