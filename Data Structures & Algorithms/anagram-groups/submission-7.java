class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> listOfAnagrams  = new HashMap<>();
        for(String s: strs){
            char charArrayKey[] = s.toCharArray();
            Arrays.sort(charArrayKey);
            String key = new String(charArrayKey);
            List val = listOfAnagrams.getOrDefault(key, new ArrayList());
            val.add(s);
            listOfAnagrams.put(key,val );
        }
        return new ArrayList<>(listOfAnagrams.values());
        
    }
}
