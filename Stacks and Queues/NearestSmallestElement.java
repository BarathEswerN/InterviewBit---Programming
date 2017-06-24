public class Solution {
    public ArrayList<Integer> prevSmaller(ArrayList<Integer> arr) {
        ArrayList<Integer> res = new ArrayList<>();
        if (arr == null || arr.size() < 1) {
            return res;
        }
        
        Stack<Integer> st = new Stack<>();
        
        for (int i = 0; i < arr.size(); i++) {
            while (!st.isEmpty() && st.peek() >= arr.get(i)) {
                st.pop();
            }
            if (st.isEmpty()) {
                res.add(-1);
            }
            else {
                res.add(st.peek());
            }
            st.push(arr.get(i));
        }
        return res;
    }
}
