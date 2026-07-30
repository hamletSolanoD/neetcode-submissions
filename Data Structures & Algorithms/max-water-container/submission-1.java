class Solution {
    public int maxArea(int[] heights) {
        int pointer1 = 0;
        int pointer2 = heights.length-1;
        int max = 0;
        while(pointer1 < pointer2){
            int area = Math.min(heights[pointer1],heights[pointer2]) * (pointer2-pointer1);
            max = Math.max(max, area);
            if(heights[pointer1] > heights[pointer2]){
                pointer2--;
            }
            else{
                pointer1++;
            }
        }
      return max;
        
    }
}
