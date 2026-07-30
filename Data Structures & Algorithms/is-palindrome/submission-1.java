class Solution {
    public boolean IsLetterOrNumber(char letter){
        return (letter >= 'a' && letter <= 'z' ) || (letter >= '0' && letter <= '9');
    }
    public boolean isPalindrome(String s) {
        s = s.replace(" ","");
        s = s.toLowerCase();

        int leftpointer = 0;
        int rightPointer = s.length()-1;
    

        while(leftpointer < rightPointer){
            if(!IsLetterOrNumber(s.charAt(leftpointer))) {leftpointer++; continue;}
            if(!IsLetterOrNumber(s.charAt(rightPointer))) {rightPointer--; continue;}
            if(s.charAt(leftpointer) != s.charAt(rightPointer)) return false;
            leftpointer++;
            rightPointer--;
        }
        return true;
        
    }
}
