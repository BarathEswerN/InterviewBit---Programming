public class Solution {
    public int maxArr(ArrayList<Integer> A) {
        
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        int max3 = Integer.MIN_VALUE;
        int max4 = Integer.MIN_VALUE;
        
        int ans = Integer.MIN_VALUE;
        
        for (int i = 0; i < A.size(); i++) {
            max1 = Math.max(max1, A.get(i)+ i);
            max2 = Math.max(max2, A.get(i) - i);
            max3 = Math.max(max3, -A.get(i) + i);
            max4 = Math.max(max4, -A.get(i) - i);
        }
        
        for (int i = 0; i < A.size(); i++) {
            ans = Math.max(ans, max1 - (A.get(i) + i));
            ans = Math.max(ans, max2 - (A.get(i) - i));
            ans = Math.max(ans, max3 - (-A.get(i) + i));
            ans = Math.max(ans, max4 - (-A.get(i) - i));
        }

        return ans;
    }
}
