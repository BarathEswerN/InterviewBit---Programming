public class Solution {
    public boolean isPower(int a) {
        if (a <= 1) {
            return true;
        }
        
        int sqrt = (int) Math.sqrt(a);
        
        for (int i = 2; i <= (a / 2); i++) {
            for (int j = 2; j <= sqrt; j++) {
                if (Math.pow(i, j) == a) {
                    return true;
                }
                else if (Math.pow(i, j) > a) {
                    break;
                }
            }
        }
        
        return false;
    }
}
