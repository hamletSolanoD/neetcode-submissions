class Solution {
    public int appendCharacters(String s, String t) {
        int sPointer = 0;
        int tPointer = 0;

        while(tPointer < t.length()){
            char tChar = t.charAt(tPointer);
            while(sPointer < s.length()){
                char sChar = s.charAt(sPointer);
                if(sChar == tChar){
                    sPointer++;
                    tPointer++;
                    break;    
                }
                sPointer++;
            }
            if(sPointer == s.length()){
                break;
            }                
        }

        return t.length()-tPointer;
        
    }
}