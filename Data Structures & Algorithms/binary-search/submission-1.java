class Solution {
    public int search(int[] nums, int target) {

        int l = 0;
        int r = nums.length-1;
        
        int rindex = -1;
        while(l <= r){
            int midIndPoint = l+(r-l/2);
            int gotNumber = nums[midIndPoint];
            if(gotNumber < target){
                l = midIndPoint+1;
                continue;
            } 
            else if(gotNumber > target){
                r = midIndPoint-1;
                continue;
            }
            else{
                return midIndPoint;
            }
        }
        return rindex;
    }
}
