class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        HashSet< List<Integer>> result = new HashSet<>();  
        for(int p1 = 0; p1 < nums.length; p1 ++){
            for(int p2 = p1+1; p2 < nums.length; p2++){
                long finalTarget = (long) target - (nums[p1]+nums[p2]);
                int p3 = p2+1;
                int p4 = nums.length-1;
                while(p3 < p4){
                    long currentSum =(long)  nums[p3] + nums[p4];
                    if(currentSum == finalTarget){
                        result.add(Arrays.asList(nums[p1],nums[p2],nums[p3],nums[p4]));
                        p3++;
                        p4--;
                    }
                    if(currentSum > finalTarget){
                        p4--;
                    }
                    if(currentSum < finalTarget){
                        p3++;
                    }
                }
            }
        }
        return new ArrayList<>(result);
    }
}