public class Solution {
    public int solve(ArrayList<Integer> A) {
        Collections.sort(A);
        
        int n = A.size();
        for (int i = 0; i < n-1; i++) {
            if (A.get(i) == A.get(i + 1)) {
                continue;
            }
            if (A.get(i) == (n - (i + 1))) {
                return 1;
            }
        }
        
        if (A.get(n - 1) == 0) {
            return 1;
        }
        return -1;
    }
}
