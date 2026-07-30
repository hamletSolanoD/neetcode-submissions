class Solution {
    public int removeDuplicates(int[] nums) {
        HashSet<Integer> numbers = new HashSet<>();
        for(int n : nums){
            numbers.add(n);
        }
       int k =  numbers.size();

        removeDuplicatesFromArray(nums,k);

       return k;
    }
    public void removeDuplicatesFromArray(int[] nums, int k){
        int l = 0;
        int r = l+1;
        while(l < k && r < nums.length){
            if(nums[l] == nums[r]){
                r++;
                continue;
            }
            else{
                l++;
                nums[l] = nums[r];
                r++;
            }
        }

    }
}