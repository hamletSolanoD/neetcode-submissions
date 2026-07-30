class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) return false;
        HashMap<Character, Integer> hasSet = new HashMap<>();

        for(char e: s.toCharArray()){
            hasSet.put(e,hasSet.getOrDefault(e,0)+1);
        }
         for(char e: t.toCharArray()){
            hasSet.put(e,hasSet.getOrDefault(e,0)-1);
            if(hasSet.getOrDefault(e,0) < 0 ){
                return false;
            }
        }
        return true;
    }
}
