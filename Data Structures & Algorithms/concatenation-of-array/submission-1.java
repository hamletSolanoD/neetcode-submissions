class Solution {
    public int[] getConcatenation(int[] nums) {
        // int[] = length zx1
        // int[] ans = length zx2
        int[] ans = new int[nums.length*2];
        for(int e = 0; e < nums.length;e++){
            ans[e] = nums[e];
            ans[e+nums.length] = nums[e];
        }
        return ans;
    }
}