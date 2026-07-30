class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, ArrayList<String>> groupOfAnagrams = new HashMap<>();
            for(String s : strs){
                char keyArray[] = s.toCharArray();
                Arrays.sort(keyArray);
                String key = new String(keyArray);
                ArrayList<String> set = groupOfAnagrams.getOrDefault(key,new ArrayList<>());
                set.add(s);
                groupOfAnagrams.put(key,set);
            }
        return new ArrayList<>(groupOfAnagrams.values());
    }
}
