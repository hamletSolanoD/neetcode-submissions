class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        HashSet<List<Integer>> result = new HashSet<>();
        Arrays.sort(nums);
        for(int e = 0; e < nums.length;e++){
            int expectedSum = 0-nums[e];
            int pointer1 = e+1;
            int pointer2 = nums.length-1;
            while(pointer1 < pointer2){
                int currentSum = nums[pointer1] + nums[pointer2];
                if(currentSum > expectedSum) pointer2--;
                if(currentSum < expectedSum) pointer1++;
                if(currentSum == expectedSum){
                    result.add(Arrays.asList(nums[e],nums[pointer1],nums[pointer2]));
                    pointer1++;
                    pointer2--;
                }
            }
        }
        
       return new ArrayList<>(result);
    }
}
