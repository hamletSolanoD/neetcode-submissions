class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> lettersCount = new HashMap<>();
        for(char a:s.toCharArray()){
            lettersCount.put(a,lettersCount.getOrDefault(a,0)+1);
        }
        for(char a: t.toCharArray()){
            if(lettersCount.get(a) == null) return false;
            else{
                lettersCount.put(a, lettersCount.get(a)-1);
                if(lettersCount.get(a) < 0 ) return false;
            }
        }
        for(Map.Entry<Character, Integer> entry : lettersCount.entrySet()){
            if(entry.getValue() > 0) {return false;}
        }
        return true;
    
    }
   
}
