class Solution {
    HashMap<Integer, Integer> opts = new HashMap<Integer,Integer>();
    int maxMoney = 0;
    public int rob(int[] nums) {
        
        for(int i = 0; i < nums.length; i++){
            dfs(nums, i);
        }
        return maxMoney;
    }

    public int dfs(int[] nums, int pos){
        if(pos >= nums.length) return 0;
        if(opts.containsKey(pos)) return opts.get(pos);
        int currentSum = 0;
        currentSum += nums[pos];
        int skip2 = dfs(nums, pos+2);
        int skip3 = dfs(nums, pos+3);
        currentSum += Math.max(skip2,skip3);
        opts.put(pos, currentSum);
        maxMoney = Math.max(maxMoney, currentSum);
        return currentSum;
    }
}
