class Solution {
    public String minWindow(String s, String t) {
        HashMap<Character, Integer> mapOfT = new HashMap<>();

        for(char i : t.toCharArray()){
            mapOfT.put(i, mapOfT.getOrDefault(i,0)+1);
        }

        int l = 0;
        int r = 0;

        HashMap<Character,Integer> slidingMap = new HashMap<>();
        int needed = t.length();
        int have = 0;

        String currentBest = "";
        while (r < s.length()){
            char currentChar  = s.charAt(r);
            slidingMap.put(currentChar, slidingMap.getOrDefault(currentChar,0)+1);

            if(mapOfT.containsKey(currentChar)){
                if(slidingMap.get(currentChar)-1 <mapOfT.get(currentChar)){
                    have++;
                }
            }
            while(needed == have){
                char inL = s.charAt(l);
                String currentSubstring = s.substring(l,r+1);
                if(!currentBest.equals("")){
                    currentBest = currentSubstring.length() < currentBest.length() ? currentSubstring:currentBest;
                }
                else{
                    currentBest = currentSubstring;
                }
                slidingMap.put(inL, slidingMap.get(inL)-1);
                l++; 
                if(mapOfT.getOrDefault(inL,0)>slidingMap.getOrDefault(inL,0)){
                    have--; 
                }
            }
            r++;
        }
        return currentBest;
    }
}
