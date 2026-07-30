class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashMap<String,Integer> duplicates = new HashMap<>(); 
        boolean repeat = false;
        for (int e =0; e < nums.length; e++){
            duplicates.put(nums[e]+"",duplicates.getOrDefault(nums[e]+"",0)+1);
        if(duplicates.get(nums[e]+"") > 1) {
            repeat = true;
            break;
        }
        }
        return repeat;
        
    }
}