public class Solution {
	public int largestRectangleArea(ArrayList<Integer> a) {
	    if (a == null || a.size() < 1) {
	        return 0;
	    }
	    
	    Stack<Integer> indexSt = new Stack<>();
	    int i = 0;
	    int area = 0;
	    int maxArea = 0;
	    
	    while (i < a.size()) {
	        if (indexSt.isEmpty() || a.get(indexSt.peek()) <= a.get(i)) {
	            indexSt.push(i++);
	        }
	        else {
	            int top = indexSt.pop();
	            if (indexSt.isEmpty()) {
	                area = a.get(top) * i;
	            }
	            else {
	                area = a.get(top) * (i - indexSt.peek() - 1);
	            }
	            maxArea = Math.max(area, maxArea);
	        }
	    }
	    
	    while (!indexSt.isEmpty()) {
	        int top = indexSt.pop();
	        if (indexSt.isEmpty()) {
	            area = a.get(top) * i;
	        }
	        else {
	            area = a.get(top) * (i - indexSt.peek() - 1);
	        }
	        maxArea = Math.max(area, maxArea);
	    }
	    
	    return maxArea;
	}
}
