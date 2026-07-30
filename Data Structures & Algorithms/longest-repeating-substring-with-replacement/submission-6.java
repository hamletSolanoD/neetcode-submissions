class Solution {
    public int characterReplacement(String s, int k) {
        HashMap<Character, Integer> localWindowCount = new HashMap<>();
        int l = 0;
        int r = 0;
        int finalMax = 0;
        while(r < s.length()){
            char currentChar = s.charAt(r);
            localWindowCount.put(currentChar,localWindowCount.getOrDefault(currentChar,0)+1);
            char mostFrequentChar = currentChar;

            for(Map.Entry<Character,Integer> entry : localWindowCount.entrySet()){
                if(localWindowCount.get(mostFrequentChar) < entry.getValue()) mostFrequentChar = entry.getKey();
            }
            while((r - l + 1) - localWindowCount.get(mostFrequentChar) > k){
                     for(Map.Entry<Character,Integer> entry : localWindowCount.entrySet()){
                if(localWindowCount.get(mostFrequentChar) < entry.getValue()) mostFrequentChar = entry.getKey();
            }
            localWindowCount.put(s.charAt(l),localWindowCount.get(s.charAt(l))-1 );
            l++;
            }
            finalMax = Math.max(finalMax, r-l+1);
            r++;

        }
        return finalMax;
        
    }
}
