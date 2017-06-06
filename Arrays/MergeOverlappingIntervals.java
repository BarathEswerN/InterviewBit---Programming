/**
 * Definition for an interval.
 * public class Interval {
 *     int start;
 *     int end;
 *     Interval() { start = 0; end = 0; }
 *     Interval(int s, int e) { start = s; end = e; }
 * }
 */
public class Solution {
    public ArrayList<Interval> merge(ArrayList<Interval> intervals) {
        ArrayList<Interval> res = new ArrayList<>();
        
        PriorityQueue<Interval> pq = new PriorityQueue<Interval>(new Comparator<Interval>() {
           public int compare(Interval i1, Interval i2) {
               if (i1.start != i2.start) {
                   return i1.start - i2.start;
               }
               return i1.end - i2.end;
           } 
        });
        
        for (Interval i : intervals) {
            pq.offer(i);
        }
        
        Interval prev = pq.poll();
        res.add(prev);
        
        while (pq != null && !pq.isEmpty()) {
            Interval tmp = pq.poll();
            if (tmp.start <= prev.end) {
                prev.end = Math.max(tmp.end, prev.end);
            }
            else {
                res.add(tmp);
                prev = tmp;
            }
        }
        
        return res;
    }
}
