class Solution {
    public int removeDuplicates(int[] nums) {
        int l = 0;
        int r = l+1;
        while( r < nums.length){
            if(nums[l] == nums[r]){
                r++;
                continue;
            }
            else{
                l++;
                nums[l] = nums[r];
                r++;
            }
        }
return l+1;
    }

}