class Solution {
    public boolean hasDuplicate(int[] nums) {
      Arrays.sort(nums);
      for(int e =1;e < nums.length;e++){
        if (nums[e-1] == nums[e]){
            return true;
        }
      }
      return false;
      }
}