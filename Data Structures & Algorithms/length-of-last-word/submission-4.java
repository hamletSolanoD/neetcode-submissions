class Solution {
    public int lengthOfLastWord(String s) {
        String lastString = "";
        char lastChar = ' ';
        for(char a : s.toCharArray()){
            if(lastChar == ' ' && a!= ' '){
                lastString = "";
            }
            if(a != ' '){
                lastString += a;
            }
            lastChar = a;


    
        }
        return lastString.length();
    }
}