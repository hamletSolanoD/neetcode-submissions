class Solution {
    public int maxArea(int[] heights) {
     int l = 0;
     int r = heights.length-1;
     int maxWater = 0;

     while(l<r){
        int distance = r-l;
        int rHeight = heights[r];
        int lHeight = heights[l];
        int localContainer = distance * Math.min(rHeight,lHeight);
        maxWater = Math.max(maxWater,localContainer);
        if(lHeight > rHeight){
            r--;
        }
        else{
            l++;
        }
     }
     return maxWater;
        
    }
}
