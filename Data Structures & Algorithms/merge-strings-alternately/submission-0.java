class Solution {
    public String mergeAlternately(String word1, String word2) {

        int maxLength = Math.max(word1.length(), word2.length());
        String result = "";
        for(int e = 0 ;e < maxLength; e++ ){
            if(e < word1.length()){
                result += word1.charAt(e);
            }
            if(e < word2.length()){
                result += word2.charAt(e);
            }        
        }
        return result;
    }
}