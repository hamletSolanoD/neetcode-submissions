class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,List<Integer>> numsPositions = new HashMap<>();
        for(int e = 0; e < nums.length; e++){
            numsPositions.putIfAbsent(nums[e],new ArrayList<>());
            numsPositions.get(nums[e]).add(e);  
        }
        int index1 = 0;
        int index2 = 0;
        for(Map.Entry<Integer,List<Integer>> e : numsPositions.entrySet()){
            List<Integer> listOfPositions = e.getValue();
            int currentValue = e.getKey();
            int expectedValue = target-currentValue;
            if(numsPositions.containsKey(expectedValue)){
                if(expectedValue == currentValue){
                    index1 = numsPositions.get(currentValue).get(0);
                    index2 = numsPositions.get(currentValue).get(1);
                    break;
                }
                else{
                    index1 = numsPositions.get(currentValue).get(0);
                    index2 = numsPositions.get(expectedValue).get(0);
                    break;
                }


            }
        }
        int answer[] = new int[]{index1,index2};
         Arrays.sort(answer);
        return answer;
    }
}
