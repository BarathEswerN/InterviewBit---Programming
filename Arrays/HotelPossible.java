class Time {
    int val;
    boolean isArr;

    public Time(int val, boolean isArr) {
        this.isArr = isArr;
        this.val = val;
    }
}
public class Solution {
    public boolean hotel(ArrayList<Integer> arrive, ArrayList<Integer> depart, int K) {
        ArrayList<Time> time = new ArrayList<>();
        
        for (Integer i : arrive) {
            Time t = new Time(i, true);
            time.add(t);
        }
        
        for (Integer i : depart) {
            Time t = new Time(i, false);
            time.add(t);
        }
        
        Collections.sort(time, new Comparator<Time>() {
            public int compare(Time t1, Time t2) {
                if (t1.val != t2.val)
                    return t1.val - t2.val;
                if (t2.isArr)
                    return -1;
                return 1;
            }
        });
        
        int[] cArr = new int[time.size()];
        
        for (int i = 0; i < time.size(); i++) {
            if (time.get(i).isArr) {
                cArr[i] = 1;
            }
            else {
                cArr[i] = -1;
            }

        }
        
        int sum = cArr[0];
        int maxSum = sum;

        for (int i = 1; i < cArr.length; i++) {
            sum += cArr[i];
            maxSum = Math.max(sum, maxSum);
        }

        return (maxSum <= K);
    }
}
