class Solution {
    public int removeDuplicates(int[] nums) {
        int localCount = 0; 
        int lastUsfullIndex = 1;
        for(int e = 1; e < nums.length; e++){
            if(nums[e] != nums[e-1]){
                localCount = 0;
                nums[lastUsfullIndex] = nums[e];
                lastUsfullIndex = lastUsfullIndex+1;
            }
            else{
                if(localCount < 1){
                    nums[lastUsfullIndex] = nums[e];
                    lastUsfullIndex++;

                }
                localCount++;
            }
        }
    
        return lastUsfullIndex;
    }
}