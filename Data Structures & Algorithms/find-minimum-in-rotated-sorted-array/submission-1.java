class Solution {
    public int findMin(int[] nums) {

        int l = 0;
        int r = nums.length-1;
        while (l < r){
            int mp = l + ((r-l))/2;
            if(nums[mp] > nums[r]){
                l = mp+1;
            }
            else{
                r = mp;
            }
        }
        int diff = l;
        return nums[diff];

        
    }
}
