class Solution {
    public void reverseString(char[] s) {
        char extra = ' ';
        for(int actual = 0;actual < s.length/2;actual++){
            int reverse = s.length-1-actual;
            extra = s[actual];
            s[actual] = s[reverse];
            s[reverse] = extra;
        }
    }
}