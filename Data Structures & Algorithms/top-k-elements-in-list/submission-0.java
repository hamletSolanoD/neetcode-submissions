class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Arrays.sort(nums);
        HashMap<String, Integer> countOfNumbers = new HashMap<String, Integer>();
        for(int e : nums){
            int currentCount = countOfNumbers.getOrDefault(e+"",0)+1;
            countOfNumbers.put(e+"",currentCount);
        }
        List<Map.Entry<String, Integer>> orderedList = new ArrayList<Map.Entry<String,Integer>>(countOfNumbers.entrySet());
        Collections.sort(orderedList, (e1,e2) -> {return e2.getValue().compareTo(e1.getValue()); });
        int FinalAnswer[] = new int[k];

        for(int e = 0 ;e < k; e++ ){
            FinalAnswer[e] = Integer.parseInt(orderedList.get(e).getKey());
        }

return FinalAnswer;

        
    }
}
