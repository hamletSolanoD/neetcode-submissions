class Solution {
    public void moveZeroes(int[] nums) {
        int l = 0;
        int r = l+1;
        while( l < nums.length){
            if(nums[l] == 0){
                r = l+1;
                while(r < nums.length && nums[r] == 0){
                    r++;
                }
                if(r < nums.length && nums[r] != 0){
                    nums[l] = nums[r];
                    nums[r] = 0;
                }
            }
            l++;
           
        }
    }
}