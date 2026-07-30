class Solution {

    public boolean containsSubString(HashMap<Character, Integer> mapOfT,
    HashMap<Character,Integer> slidingMap){
        for(Map.Entry<Character,Integer> tEntry : mapOfT.entrySet()){
            int entryCount = tEntry.getValue();
            int slidingCount = slidingMap.getOrDefault(tEntry.getKey(),0);
            if(entryCount > slidingCount) return false;
        }
        return true;

    }

    public String minWindow(String s, String t) {
        HashMap<Character, Integer> mapOfT = new HashMap<>();

        for(char i : t.toCharArray()){
            mapOfT.put(i, mapOfT.getOrDefault(i,0)+1);
        }

        int l = 0;
        int r = 0;

        HashMap<Character,Integer> slidingMap = new HashMap<>();

        String currentBest = "";
        while (r < s.length()){
            char currentChar  = s.charAt(r);
            slidingMap.put(currentChar, slidingMap.getOrDefault(currentChar,0)+1);
            while(containsSubString(mapOfT,slidingMap)){
                char inL = s.charAt(l);
                if(containsSubString(mapOfT,slidingMap)){
                    String currentSubstring = s.substring(l,r+1);
                    if(!currentBest.equals("")){
                        currentBest = currentSubstring.length() < currentBest.length() ? currentSubstring:currentBest;
                    }
                    else{
                        currentBest = currentSubstring;
                    }
                }
                slidingMap.put(inL, slidingMap.get(inL)-1);
                l++; 
            }
            r++;
        }
        return currentBest;
    }
}
