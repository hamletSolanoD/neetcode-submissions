class Solution {
    HashMap<Integer,Integer> optim = new HashMap<>();
    int maxSum = 0;

    public int rob(int[] nums) {
        if(nums.length==1) return nums[0];
       
        dfs(Arrays.copyOfRange(nums, 0,nums.length-1),0);
        optim.clear();
        dfs(Arrays.copyOfRange(nums, 1,nums.length),0);
        return maxSum;
    }
    public int dfs(int[] nums, int index){
        if(index>nums.length-1)return 0;
        if(optim.containsKey(index)) return optim.get(index);
        int totalSum = 0;
        int take = nums[index] + dfs(nums,index+2);
        int skip = dfs(nums,index+1);
        totalSum += Math.max(take,skip);
        optim.put(index, totalSum);
        maxSum = Math.max(maxSum, totalSum);
        return totalSum; 
    }
}
