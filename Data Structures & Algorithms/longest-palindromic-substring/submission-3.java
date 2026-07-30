class Solution {
    public String maxString = "";
    public HashMap<String, Boolean> memo = new HashMap<>();
    public char[] charMap;
    public String longestPalindrome(String s) {
        charMap = s.toCharArray();
        for(int a = 0; a < s.length(); a++){
            dfs(charMap[a]+"", a);
        }
        return maxString;
        
    }

    public boolean dfs(String strToEval, int position){
        if(!memo.containsKey(strToEval))
        {memo.put(strToEval,isPal(strToEval));}
        System.out.println(strToEval+" "+ memo.get(strToEval));
        if(maxString.length() <= strToEval.length() && memo.get(strToEval)) {
            maxString = strToEval;
        }
         try{
          boolean  right = dfs(strToEval+charMap[position+1], position+1);
        }
        catch(Throwable e){
        }
      
        return true;
    }
    public boolean isPal(String strToEval){
        return strToEval.equals(new StringBuilder(strToEval).reverse().toString());
    }
}
