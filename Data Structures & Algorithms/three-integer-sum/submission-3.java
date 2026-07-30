class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        HashSet<List<Integer>> res = new HashSet<>();
        for(int e = 0;e< nums.length;e++){
            int cValue = nums[e];
            int l = e+1;
            int r = nums.length-1;
            int localtarget = 0-cValue;
            while(l < r){
                int localSum = nums[l] + nums[r];
                if(localSum > localtarget) {
                    r--;
                }
                else if(localSum < localtarget){
                    l++;
                }
                else{
                    ArrayList<Integer> newAns = new ArrayList<>();
                    newAns.add(cValue);
                    newAns.add(nums[l]);
                    newAns.add(nums[r]);
                    res.add(newAns);
                    l++;
                    r--;
                    continue;
                }
            }
        }
        return new ArrayList<>(res);
    }
}
