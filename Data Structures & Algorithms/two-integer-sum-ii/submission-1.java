class Solution {
    public int[] twoSum(int[] numbers, int target) {
                HashMap<Integer,List<Integer>> numsPositions = new HashMap<>();
        for(int e = 0; e < numbers.length; e++){
            numsPositions.putIfAbsent(numbers[e],new ArrayList<>());
            numsPositions.get(numbers[e]).add(e);  
        }
        int index1 = 0;
        int index2 = 0;
        for(Map.Entry<Integer,List<Integer>> e : numsPositions.entrySet()){
            List<Integer> listOfPositions = e.getValue();
            int currentValue = e.getKey();
            int expectedValue = target-currentValue;
            if(numsPositions.containsKey(expectedValue)){
                if(expectedValue == currentValue){
                    if(numsPositions.get(currentValue).size()<2) continue;
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
        int answer[] = new int[]{index1+1,index2+1};
         Arrays.sort(answer);
        return answer;
    }
}
