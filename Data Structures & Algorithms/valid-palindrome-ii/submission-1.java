class Solution {
    public boolean validPalindrome(String s) {
    int l = 0;
    int r = s.length()-1;
    while(l<r){

        if(s.charAt(l) != s.charAt(r)){
            return IsPalindrome(s, l+1, r)  || //may be the removing bad char is l
            IsPalindrome(s, l, r-1); //maybe the bad one is the current r
        }
        l++;
        r--;
    }
    return true;
    
    }

    public boolean IsPalindrome(String s,int l, int r){
        System.out.println(s+" "+l+" "+r);
        while(l<r){
            if(s.charAt(l) == s.charAt(r)){
                l++;
                r--;
                continue;
            }
            else{
                return false;
            }
        }
        return true;
    }
}