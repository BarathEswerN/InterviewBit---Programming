public class Solution {
	public ArrayList<ArrayList<Integer>> generate(int a) {
	    ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>(a);
	    
	   for (int i = 0; i < a; i++) {
	       ArrayList<Integer> tmp = new ArrayList<>();
	       res.add(tmp);
	   }
	    
	   for (int line = 0; line < a; line++) {
	       for (int i = 0; i <= line; i++) {
	           if (i == 0 || i == line) {
	               res.get(line).add(1);
	           }
	           else {
	               int val = res.get(line - 1).get(i - 1) + res.get(line - 1).get(i);
	               res.get(line).add(val);
	           }
	       }
	   }
	    
	    return res;
	}
}
