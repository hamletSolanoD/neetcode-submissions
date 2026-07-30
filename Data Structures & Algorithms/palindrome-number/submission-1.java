class Solution {
    public boolean isPalindrome(int x) {
        if(x < 0) return false;
        String y = String.valueOf(x);
       for(int e = 0; e < y.length(); e++){
        if(y.charAt(e) != (y.charAt(y.length()-e-1))){
            return false;
        }
       }
    return true;
    }

}