class Solution {
    public String longestCommonPrefix(String[] strs) {
        String minStr = strs[0];
        StringBuilder maxPrefix = new StringBuilder("");
        for(String str: strs){
            if(minStr.length() >= str.length())
            {
                minStr = str;
            }
        }        
        for(int minChar = 0; minChar < minStr.length(); minChar++){
            for(String str: strs){
                if(str.charAt(minChar) != minStr.charAt(minChar)){
                   return maxPrefix.toString();
                }
            }
            maxPrefix.append(minStr.charAt(minChar));
        }
        return maxPrefix.toString();
    }
}