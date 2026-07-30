class Solution {
    public int lengthOfLastWord(String s) {
        StringBuilder lastString = new StringBuilder("");
        char lastChar = ' ';
        for(char a : s.toCharArray()){
            if(lastChar == ' ' && a!= ' '){
                lastString =  new StringBuilder("");
            }
            if(a != ' '){
                lastString.append(a);
            }
            lastChar = a;
        }
        return lastString.length();
    }
}