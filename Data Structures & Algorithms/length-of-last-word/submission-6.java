class Solution {
    public int lengthOfLastWord(String s) {
        int lastStringCount = 0;
        char lastChar = ' ';
        for(char a : s.toCharArray()){
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