class Solution {
    public int longestConsecutive(int[] nums) {
        HashMap<Integer,ArrayList<Integer>> positionsAndNumbers = new HashMap();
        for(int e = 0; e < nums.length; e++){
            ArrayList<Integer> positions = positionsAndNumbers.getOrDefault(nums[e], new ArrayList<>());
            positions.add(e);
            positionsAndNumbers.put(nums[e],positions);
        }
        int maxLength = 0;
        for(int e = 0 ; e < nums.length; e++){
            if(!positionsAndNumbers.containsKey(nums[e]-1)){
                int localCount = 0;
                while(true){
                    int nextNumber = nums[e]+localCount;
                    ArrayList<Integer> positions = positionsAndNumbers.get(nextNumber);
                    if(positions != null){
                        
                    }
                    else{
                        break;
                    }
                    localCount++;
                }
                maxLength = Math.max(maxLength, localCount);
            }
        }
        return maxLength;
    }
}
