class Solution {
    public int scoreOfString(String s) {
        // for position e = 1
        // s[e]-s[e-1] 
            // sumar diferencia a una variable global
        int totalSum = 0;    
        for(int e = 1; e < s.length(); e++){
            totalSum += Math.abs(s.charAt(e) - s.charAt(e-1));
        }
     return totalSum;   
    }
}