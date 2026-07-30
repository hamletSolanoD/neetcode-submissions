class Solution {
    public int minEatingSpeed(int[] piles, int h) {

        int minBanPerHour = 1;
        int maxBanPerHour = Integer.MIN_VALUE;
        for(int e : piles){
            maxBanPerHour = Math.max(maxBanPerHour,e);
        }
        int middPoint = 0;
        int res = 0;
        while(minBanPerHour <= maxBanPerHour){
             middPoint = minBanPerHour+((maxBanPerHour-minBanPerHour)/2);
            int totalHours = 0;
            for(int pile:  piles){
                totalHours += Math.ceil((double)pile/middPoint);
            }
            if(totalHours > h){
                minBanPerHour = middPoint+1;
            }
            else if(totalHours <= h){
                maxBanPerHour = middPoint-1;
                res = middPoint;
            }
        }
        return res;
    }
}
