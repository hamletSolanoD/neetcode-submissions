class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length()) return false;
        HashMap<Character,Character> mapFromStoT = new HashMap<>();
        HashMap<Character,Character> mapFromTtoS = new HashMap<>();
       for(int e = 0; e < t.length(); e++){
        char charS = s.charAt(e);
        char charT = t.charAt(e);
        mapFromStoT.putIfAbsent(charS, charT);
        mapFromTtoS.putIfAbsent(charT,charS);

        if(mapFromStoT.get(charS) != charT || mapFromTtoS.get(charT) != charS){
            return false;
        } 
       }
       return true;

       
    }
}