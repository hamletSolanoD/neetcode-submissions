class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> counterOfOcc = new HashMap<>();
        for(char e : s.toCharArray()){
            counterOfOcc.putIfAbsent(e,0);
            counterOfOcc.put(e, counterOfOcc.get(e)+1);
        }
        for(char e : t.toCharArray()){
            if(counterOfOcc.get(e) != null){
                counterOfOcc.put(e,counterOfOcc.get(e)-1);
                if(counterOfOcc.get(e) < 0){
                    return false;
                }
            }else{
                return false;
            }
        }
        for(Map.Entry<Character, Integer> e : counterOfOcc.entrySet()){
            if(e.getValue() != 0) return false; 
        }


        return true;
       
    }
}
