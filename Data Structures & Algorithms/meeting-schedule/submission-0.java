/**
 * Definition of Interval:
 * public class Interval {
 *     public int start, end;
 *     public Interval(int start, int end) {
 *         this.start = start;
 *         this.end = end;
 *     }
 * }
 */

class Solution {
    public boolean canAttendMeetings(List<Interval> intervals) {

        Collections.sort(intervals, Comparator.comparingInt(i -> i.start));

        Interval past = null; 
        for(Interval i : intervals ){
            if(past!=null){
                if(past.end > i.start) return false;
            }
            past = i;
        }
        return true;


    }
}
