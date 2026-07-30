class Solution {
    public int search(int[] nums, int target) {
        Arrays.sort(nums);
        int l = 0;
        int r =  nums.length-1;
        while(l<=r){
            int middPoint = ((r-l)/2) +l;
            System.out.println(middPoint);
            if(nums[middPoint] > target){
                r = middPoint-1;
            } 
            else if(nums[middPoint] < target){
                l = middPoint+1;
            }
            else{
                return middPoint;
            }
        }
        return -1;
    }
}
