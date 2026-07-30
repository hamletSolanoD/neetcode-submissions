class Solution {
    public int[] productExceptSelf(int[] nums) {
        HashMap<Integer,Integer> preFixValues = new HashMap<Integer,Integer>();
        HashMap<Integer,Integer> postFixValues = new HashMap<Integer,Integer>();
        int totalMult = 1;
        for(int e = 0; e < nums.length;e++){
            totalMult *= nums[e];
          preFixValues.put(e,totalMult);
        } 
        totalMult = 1;
        for(int e = nums.length-1; e >= 0;e--){
            totalMult *= nums[e];
          postFixValues.put(e,totalMult);
        } 

        int result[] = new int[nums.length];
    
        for(int e = 0; e < nums.length; e++){
             result[e]  = preFixValues.getOrDefault(e-1,1) * postFixValues.getOrDefault(e+1,1);
        }
        return result;
    }
}  
