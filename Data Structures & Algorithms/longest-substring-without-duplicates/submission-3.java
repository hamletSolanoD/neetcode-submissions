class Solution {
    public int lengthOfLongestSubstring(String s) {
        int pointer1 = 0;
        int pointer2 = 0;

        int maxLength = 0;
        HashSet<Character> subString = new HashSet<Character>();
        while(pointer2 < s.length()){
            while(subString.contains(s.charAt(pointer2))){
                subString.remove(s.charAt(pointer1));
                pointer1++;
            }
            subString.add(s.charAt(pointer2));
            maxLength = Math.max(maxLength, pointer2-pointer1+1);
            pointer2++;
        }
        return maxLength;
      
    }
}
