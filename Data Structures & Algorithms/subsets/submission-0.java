class Solution {
    int publiccombinations[];
    TreeMap<String, ArrayList<Integer>> combinations = new TreeMap<>();
    public List<List<Integer>> subsets(int[] nums) {
        publiccombinations = nums;
        combinations.put("", new ArrayList<Integer>());
        dfs(0, "");

      return   new ArrayList<>(combinations.values());
    }


    public void dfs(int counter, String currentKey){
        if(counter >= publiccombinations.length) return;
        int currentNumber = publiccombinations[counter];
        ArrayList<Integer> newSubset = new ArrayList<>(combinations.get(currentKey));
        String newKey = currentKey + currentNumber;
        newSubset.add(currentNumber);
        combinations.put(newKey,newSubset);
        dfs(counter+1, newKey);
        dfs(counter+1,currentKey);
    }
}
