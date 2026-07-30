class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character, HashSet<Character>> replacements = new HashMap<>();
        HashMap<Character, HashSet<Character>> replacements2 = new HashMap<>();
        s = s.toLowerCase();
        t = t.toLowerCase();

        for(int e = 0; e<s.length(); e++){
            char charInT = t.charAt(e);
            char charInS = s.charAt(e);

            HashSet<Character> replacementChar = replacements.getOrDefault(charInT,new HashSet<>());
            replacementChar.add(charInS);
            replacements.put(charInT, replacementChar);
            if(replacementChar.size() > 1) return false;

            HashSet<Character> replacementChar2 = replacements2.getOrDefault(charInS,new HashSet<>());
            replacementChar2.add(charInT);
            replacements2.put(charInS, replacementChar2);
            if(replacementChar2.size() > 1) return false;

        }

        return true;

          
    }
}