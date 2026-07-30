class Solution {
    public int trap(int[] height) {
        if(height == null || height.length == 0) return 0; 
        int pointer1 = 0;
        int pointer2 = height.length-1;
        int leftMaxColumn = height[pointer1];
        int rightMaxColumn = height[pointer2];

        int res = 0;
        while(pointer1 < pointer2){
            if(leftMaxColumn < rightMaxColumn){
                pointer1++;
                leftMaxColumn = Math.max(leftMaxColumn, height[pointer1]);
                res += leftMaxColumn-height[pointer1];                
            }
            else{
                pointer2--;
                rightMaxColumn = Math.max(rightMaxColumn, height[pointer2]);
                res += rightMaxColumn - height[pointer2];
            }
        }
        return res;
        
    }
}
