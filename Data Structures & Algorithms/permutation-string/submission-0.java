/*
return true if a permutation of s1 is inside s2.
a permutation is to have the EXACT SAME WORDS AND COUNT OF WORD but in different order
i need to detect how many chars i have in s1 and what type of them, and then found those exact
chars as a sequence window inside s2

*/

class Solution {
    public boolean checkInclusion(String s1, String s2) {
        HashMap<Character, Integer> originalWord = new HashMap<>();
        for(char e: s1.toCharArray()){
            originalWord.put(e, originalWord.getOrDefault(e,0)+1);
        }
        HashMap<Character, Integer> secondWord = new HashMap<>();
        int l = 0;
        int r = 0;
        while(r < s2.length()){
            if(originalWord.get(s2.charAt(r)) == null){
                secondWord = new HashMap<>();
                secondWord.put(s2.charAt(r),1);
                l=r;
            }else{
                secondWord.put(s2.charAt(r), secondWord.getOrDefault(s2.charAt(r), 0)+1);
                while(secondWord.get(s2.charAt(r)) > originalWord.get(s2.charAt(r))){
                    secondWord.put(s2.charAt(l),secondWord.get(s2.charAt(l))-1);
                    l++;
                }
            }
            boolean IsComplete = true;
            for(Map.Entry e: originalWord.entrySet()){
                if(secondWord.getOrDefault(e.getKey(),0) != e.getValue()) {
                    IsComplete = false;
                    break;
                }
            }
            if(IsComplete) return true;
            r++;
        }
        return false;
    }
}
