class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> countOfNumbers = new HashMap<Integer, Integer>();
        for(int e : nums){
            int currentCount = countOfNumbers.getOrDefault(e,0)+1;
            countOfNumbers.put(e,currentCount);
        }
        List<Map.Entry<Integer, Integer>> orderedList = new ArrayList<Map.Entry<Integer,Integer>>(countOfNumbers.entrySet());
        Collections.sort(orderedList, (e1,e2) -> {return e2.getValue().compareTo(e1.getValue()); });
        int FinalAnswer[] = new int[k];

        for(int e = 0 ;e < k; e++ ){
            FinalAnswer[e] = orderedList.get(e).getKey();
        }

return FinalAnswer;

        
    }
}
