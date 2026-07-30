class Solution {
    public int maxArea(int[] heights) {
        int l = 0;
        int r = heights.length-1; 
        int maxWater = 0;
        while(l < r){
            int maxHeight = Math.min ( heights[l], heights[r]); 
            int currCapacity = (r-l) * maxHeight;
            maxWater = Math.max(maxWater,currCapacity);
            if(heights[r] > heights[l] ){
                l++;
            }  
            else{
                r--;
            }
        }
        return maxWater;

        
    }
}
