class Solution {
    public String longestCommonPrefix(String[] strs) {
        List<String> strsToArray = Arrays.asList(strs);
        Collections.sort(strsToArray, (l1,l2) -> {return Integer.compare(l1.length(),l2.length());});


        String maxPrefix = "";
        for(char e: strsToArray.get(0).toCharArray()){
                        maxPrefix += e;

            for(String s : strsToArray){
               if(!s.startsWith(maxPrefix)){
                return maxPrefix.substring(0, maxPrefix.length()-1);
               }
            }
        }
        return strsToArray.get(0);

    }
}