class Solution {
    public boolean validPalindrome(String s) {
        StringBuilder sreverse = new StringBuilder(s);
        boolean isEqual = sreverse.reverse().toString().equals(s);
        if(isEqual) return isEqual;
        for(int e = 0; e < s.length(); e++){
            String newWord = s.substring(0,e) + s.substring(e+1,s.length());
            int r = newWord.length()-1;
            int l = 0;
            boolean localPalindrome = true;
            while(l < r){
                if(newWord.charAt(l) == newWord.charAt(r)){
                    l++;
                    r--;
                    continue;
                }
                else{
                    localPalindrome = false;
                    break;
                }
            }
            if(localPalindrome) return true;
        }
        return false;

    }
}