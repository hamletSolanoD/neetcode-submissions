class Solution {
    public boolean isSubsequence(String s, String t) {
        if(s.isBlank() && !t.isBlank()) return true;
        if(t.isBlank() && !s.isBlank()) return false;

        int tPointer = 0;
        for(int e = 0; e < s.length(); e ++){
            char sChar = s.charAt(e);
            while(tPointer < t.length()){
                char tChar = t.charAt(tPointer);
                if(tChar == sChar){
                    tPointer++;
                    break;
                }
                tPointer++;
            }
            if(tPointer == t.length() && e != s.length()-1){
                return false;
            }
        }
        return true;
        
    }
}