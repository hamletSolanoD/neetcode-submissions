class Solution {
    public int maxArea(int[] heights) {
        int pointer1 = 0;
        int max = 0;
        while(true){
            int pointer2 = heights.length-1;
            while(pointer2 > pointer1){
                int currentDifference = pointer2-pointer1;
                max = Math.max(max,currentDifference*(Math.min(heights[pointer1],heights[pointer2])));
                pointer2--;
            }        
            if(pointer1 == heights.length-2) break;
            pointer1++;
        }
        return max;
        
    }
}
