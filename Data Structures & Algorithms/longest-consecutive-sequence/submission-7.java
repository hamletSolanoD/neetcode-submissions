class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0) return 0;
        HashMap<Integer,Integer> numsArray = new HashMap<>();
        for(int e: nums){
            numsArray.put(e,1);
        }
        for(int e: numsArray.keySet()){
            if(!numsArray.containsKey(e-1)){
                int counter =e+1; 
                while(true){
                    if(numsArray.containsKey(counter)){
                        numsArray.put(e,numsArray.get(e)+1);
                    counter++;
                    }
                    else break;
                }
            }
        } 
      return   Collections.max(numsArray.values());
    }
}
