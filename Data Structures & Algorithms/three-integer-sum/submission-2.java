class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        HashSet< List<Integer> > result = new HashSet<>();
        Arrays.sort(nums);
        for(int e = 0; e < nums.length; e++){
            int expectedNumber = 0 - nums[e];
            int l = e+1;
            int r = nums.length-1;
            
            while(l < r){
                int finalSum = nums[l]+nums[r];
                if(finalSum == expectedNumber){
                    result.add(Arrays.asList(nums[e],nums[l],nums[r]));
                    l++;
                    r--;
                    continue;
                }
                if(finalSum > expectedNumber){
                    r--;
                    continue;
                }
                if  (finalSum < expectedNumber){
                    l++;
                    continue;
                }
            }
        }
    return new ArrayList<>(result);
    }
}
