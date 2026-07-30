class Solution {
    HashMap<String,Integer> possibleSubSequence = new HashMap();
    public int longestCommonSubsequence(String text1, String text2) {
        return dfs(text1,text2,0 ,0);    
    }
    
    public int dfs(String txt1, String txt2, int p1,int p2){
        String key = "txt1"+p1+"txt2"+p2;
        if(possibleSubSequence.containsKey(key)) return possibleSubSequence.get(key);
        if(txt1.length() <= p1 || txt2.length() <= p2) return 0;
        char character1 = txt1.charAt(p1);
        char character2 = txt2.charAt(p2);
        int result = 0;
        if(character1 == character2){
            result += 1;
            result += dfs(txt1, txt2,p1+1,p2+1);
        }
        else{
            int dfs1 = dfs(txt1, txt2, p1+1,p2);
            int dfs2 = dfs(txt1, txt2, p1,p2+1);
            result += Math.max(dfs1,dfs2);
        }
        possibleSubSequence.put(key,result);
        return result;
    }
}
