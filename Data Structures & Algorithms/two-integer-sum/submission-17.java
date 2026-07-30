class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> keyValues = new HashMap<>();
        int ans[] = new int[2];
        for(int e = 0; e < nums.length;e++){
            int diff =  target - nums[e];
            if(keyValues.get(diff) != null){
                ans[1] = e;
                ans[0] = keyValues.get(diff);
                return ans;
            }
            keyValues.put(nums[e], e);
        }
        return ans;
        
    }
}
