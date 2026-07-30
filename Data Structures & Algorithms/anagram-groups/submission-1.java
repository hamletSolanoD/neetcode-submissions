class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String> > groupedAnagrams = new HashMap<>();
        for(String s : strs){
            char charArray[] = s.toCharArray();
            Arrays.sort(charArray);
            String key = new String(charArray);
            groupedAnagrams.putIfAbsent(key, new ArrayList<String>());
            groupedAnagrams.get(key).add(s);
        }
        return new ArrayList<>(groupedAnagrams.values());

    }
}
