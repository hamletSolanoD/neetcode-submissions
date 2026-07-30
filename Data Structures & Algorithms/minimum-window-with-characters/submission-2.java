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
        int bestL = 0;
        int minLength = Integer.MAX_VALUE;
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
                if(minLength > r-l){
                    bestL = l;
                    minLength = r-l;
                }
                slidingMap.put(inL, slidingMap.get(inL)-1);
                l++; 
                if(mapOfT.getOrDefault(inL,0)>slidingMap.getOrDefault(inL,0)){
                    have--; 
                }
            }
            r++;
        }
        return minLength != Integer.MAX_VALUE ?s.substring(bestL,bestL+minLength+1): "";
    }
}
