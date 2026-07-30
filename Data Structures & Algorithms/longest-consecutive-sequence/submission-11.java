class Solution {
    public int longestConsecutive(int[] nums) {
    HashSet<Integer> setOfNums = new HashSet<>();
    for(int e: nums){
        setOfNums.add(e);
    }
    int maxLength = 0;
    for(int e : nums ){
        if(setOfNums.contains(e-1)) continue;
        int counter = 0;
        while(true){
            if(!setOfNums.contains(e+counter)) break;
            maxLength = Math.max(maxLength, counter+1);
            counter++;
        }
    }
    return maxLength;
    }
}
