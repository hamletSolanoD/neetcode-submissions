class Solution {
    public int lengthOfLastWord(String s) {
        String Array[] = s.split(" ");
        return Array[Array.length-1].length();
    }
}