class Solution {
    public int scoreOfString(String s) {
        int score = 0;
        char last = ' ';
        for(char n : s.toCharArray()){

    if(last == ' ') 
            {last = n; continue;}
            score += Math.abs(n-last);
            last = n;
        }
        
    return score;

    }
}