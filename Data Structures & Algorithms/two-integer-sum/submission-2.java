class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<String, Integer> differenceArray = new HashMap<String,Integer>();
        int WinningNumber1 =0;
        int WinningNumber2 =0;
        int Index1=-1;
        int Index2=-1;
        for(int e: nums){
            differenceArray.put(e+"", target-e);
            if(differenceArray.getOrDefault((target-e)+"",0)!=0){
                WinningNumber2 = e;
                WinningNumber1 = target-e;
            }
        }
        for(int e = 0;e < nums.length;e++){
            if(nums[e] == WinningNumber1 && Index1 == -1) {
                Index1 = e;
                continue;
            }
        if(nums[e] == WinningNumber2 && Index2 == -1) {
                Index2 = e;
                continue;
            }
        }
        return new int[]{Index1,Index2};
    }
}
