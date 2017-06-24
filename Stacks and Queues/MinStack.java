class Solution {
    
    Stack<Integer> st1 = new Stack<>();
    Stack<Integer> st2 = new Stack<>();
    
    public void push(int x) {
        st1.push(x);
        if (st2.isEmpty()) {
            st2.push(x);    
        }
        else {
            if(st2.peek() > x) {
                 st2.push(x);
            }
            else {
                int tmp = st2.peek();
                st2.push(tmp);
            }
        }
    }

    public void pop() {
        if (st1.size() > 0) {
            st1.pop();
            st2.pop();
        }
    }

    public int top() {
        if (st1.size() > 0)
            return st1.peek();
        return -1;
    }

    public int getMin() {
        if (st2.size() > 0)
            return st2.peek();
        return -1;
    }
}
