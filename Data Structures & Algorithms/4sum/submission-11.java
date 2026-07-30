class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        HashSet<ArrayList<Integer>> result = new HashSet<>();
        for(int p1 = 0; p1 < nums.length; p1++ ){
            for(int p2 = p1+1; p2 < nums.length; p2++){
                Long currentValue = (long) nums[p1] + nums[p2];
                Long localTarget = (long) target-currentValue;
                int p3 = p2+1;
                int p4 = nums.length-1;
                while(p3<p4){
                    Long currentSum = (long) nums[p3] + nums[p4];
                    if(currentSum >localTarget ){
                        p4--;
                    }
                    else if(currentSum < localTarget){
                        p3++;
                    }
                    else{
                        ArrayList<Integer> newRest = new ArrayList<>();
                        newRest.add(nums[p1]);
                        newRest.add(nums[p2]);
                        newRest.add(nums[p3]);
                        newRest.add(nums[p4]);
                        result.add(newRest);
                        p3++;
                        p4--;
                    }
                }

            }
        }
   return new ArrayList<>(result);
    }
}