class Solution {
    public int singleNumber(int[] nums) {
        int r = 0;
        for(int e : nums){
            r ^= e;
        }
        return r;
    }
}
