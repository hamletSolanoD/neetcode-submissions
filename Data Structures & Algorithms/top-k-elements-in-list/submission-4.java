class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> frequence = new HashMap<>();
        for(int e: nums){
            frequence.put(e, frequence.getOrDefault(e,0)+1);
        }

        List<Map.Entry<Integer, Integer>> arraySort = new ArrayList<>(frequence.entrySet());
        Collections.sort(arraySort, (n1,n2) -> {return n2.getValue().compareTo(n1.getValue());});
        int r[] = new int[k];
        int counter = 0;
        for(Map.Entry<Integer, Integer> entry : arraySort){
            r[counter] = entry.getKey();
            counter++;
            if(counter == k) break;
        }
        return r;
    }
}
