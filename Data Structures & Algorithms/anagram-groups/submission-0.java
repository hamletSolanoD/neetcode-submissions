class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap< String, List<String> > mapOfOrderedKeys = new HashMap< String, List<String> >();

        for(String s: strs){
            char[] orderedChars = s.toCharArray();
            Arrays.sort(orderedChars);
            String finalString = new String(orderedChars); 
            mapOfOrderedKeys.putIfAbsent(finalString, new ArrayList<String>());
            mapOfOrderedKeys.get(finalString).add(s);
        }

     return new ArrayList<>(mapOfOrderedKeys.values());   
    }
}
