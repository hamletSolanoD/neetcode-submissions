class Solution {
    public int search(int[] nums, int target) {
        int l1=0;
        int r1 = nums.length-1;
        int splitPoint = 0;
        while(l1 < r1){
            splitPoint = ((r1-l1)/2)+l1;
            if(nums[splitPoint] > nums[r1]){
                l1 = splitPoint+1;
            } 
            else{
                r1 = splitPoint;
            }
        }

        int firstPart = binarySeach(nums,l1, nums.length-1,target);
        if(firstPart != -1) return firstPart;
        
        return binarySeach(nums, 0, l1-1,target);
    }

    public int binarySeach(int nums[], int l, int r, int target){
        int middlePoint = 0;
        while(l<=r){
            middlePoint = ((r-l)/2)+l;
            if(nums[middlePoint] == target){return middlePoint;}
            else if (nums[middlePoint] > target){
                r = middlePoint-1;
            }
            else {
                l = middlePoint+1;
            }
            
        }
        return -1;
    }
}
