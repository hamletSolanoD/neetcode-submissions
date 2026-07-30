class Solution {
    public int[] productExceptSelf(int[] nums) {
        int  finalResultOfAll = 1;
        List<Integer> numsList = new ArrayList<Integer>();
        for(int e: nums){
            finalResultOfAll *= (e == 0 ? 1: e);
            numsList.add(e);
        }
        int AnswerArray[] = new int[nums.length];

        for(int e =0; e < nums.length; e++){
            numsList.remove(e);
            if(numsList.contains(0) ) AnswerArray[e] = 0;
            else {AnswerArray[e] = finalResultOfAll / (nums[e] == 0? 1: nums[e]);}
            numsList.add(e, nums[e]);

        }
        return AnswerArray;
        
    }
}  
