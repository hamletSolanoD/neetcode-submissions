class Solution {
    public int lengthOfLastWord(String s) {
        int lastStringCount = 0;
        char lastChar = ' ';
        for(int e = 0; e<s.length(); e++){
            char a = s.charAt(e);
            if(lastChar == ' ' && a!= ' '){
                lastStringCount  =  0;
            }
            if(a != ' '){
                lastStringCount++;
            }
            lastChar = a;
        }
        return lastStringCount;
    }
}