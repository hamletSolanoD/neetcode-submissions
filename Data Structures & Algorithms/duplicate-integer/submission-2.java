class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashMap<Integer, Boolean> isDuplicated = new HashMap<>();
        for(int n : nums){
            if(isDuplicated.get(n) != null){
                return true;
            }
            isDuplicated.putIfAbsent(n, false); //if not exist
        }
        return false;
    }
}