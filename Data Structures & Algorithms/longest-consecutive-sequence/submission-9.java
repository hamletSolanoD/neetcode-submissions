class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0) return 0;
        HashMap<Integer,Integer> numsHashed = new HashMap<>();
        for(int e: nums ){
            numsHashed.put(e,1);
        }
        int maxLength = 0;
        for(int e: numsHashed.keySet()){
            if(!numsHashed.containsKey(e-1)){
                int  counter = 0;
                while(true){
                    if(numsHashed.containsKey(e+counter)){
                        maxLength = Math.max(maxLength, counter);
                    counter ++;
                    }
                    else{ break;}
                }
            }
        }
        return maxLength+1;
  
    }
}
