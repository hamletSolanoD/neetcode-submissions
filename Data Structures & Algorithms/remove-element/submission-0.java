class Solution {
    public int removeElement(int[] nums, int val) {
        int realNums = 0;
        int totalNums = 0;
        while(totalNums < nums.length){
            if(nums[totalNums] != val){
                nums[realNums] = nums[totalNums];
                 realNums++;
            }
            totalNums++;
        } 
        return realNums;
    }
}