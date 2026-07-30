class Solution {
    public int[] getConcatenation(int[] nums) {
        int finalarray[] = new int[nums.length*2];
        for(int e = 0; e < nums.length; e ++){
            finalarray[e] = nums[e];
            int secondArray = nums.length+e+1;
            finalarray[secondArray-1] = nums[e];
        }
        return finalarray;
    }
}