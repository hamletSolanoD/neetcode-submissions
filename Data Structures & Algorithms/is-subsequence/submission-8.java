class Solution {
    public boolean isSubsequence(String s, String t) {
        if(s.equals(t))return true;
        if(s.isEmpty() || s.isBlank())return true;
        if(t.isEmpty() || t.isBlank() && !s.isEmpty())return false;

        int i = 0;
        int l = 0;
        while(i < s.length()-1 && l < t.length()-1){
            if(s.charAt(i) == t.charAt(l)){
                i++;
            }
            l++;
        }
        if(i == s.length()-1) return true;
        return false;
    }
}