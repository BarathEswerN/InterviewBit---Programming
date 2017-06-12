public class Solution {
    public boolean isPrime(int n) {
        for (int i = 2; i < (n / 2); i++) {
            if ((n % i) == 0) {
                return false;
            }
        }
        return true;
    }
    
    public ArrayList<Integer> primesum(int a) {
        int strt = 2;
        int end = a - 2;
        ArrayList<Integer> res = new ArrayList<>();
        
        while (strt <= end) {
            if (isPrime(strt) && isPrime(end)) {
                res.add(strt);
                res.add(end);
                break;
            }
            strt++;
            end--;
        }
        
        return res;
    }
}
