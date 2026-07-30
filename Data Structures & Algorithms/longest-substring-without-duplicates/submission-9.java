/*
return the length of the longest substring
- no duplicated characters
- continuous sequence
- the continuity its braked once we chave the same char from any of the substring that we have

*/
class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> localSubString = new HashSet<>();
        int pointer1 = 0;
        int pointer2 = 0;
        int maxSequence = 0;
        while(pointer2 < s.length()){
            while(localSubString.contains(s.charAt(pointer2)) && pointer1 != pointer2){
                    localSubString.remove(s.charAt(pointer1));
                    pointer1++;
                }
                localSubString.add(s.charAt(pointer2));
                maxSequence = Math.max(localSubString.size(),maxSequence);
                pointer2++;

        }
        return maxSequence;
    }
}
