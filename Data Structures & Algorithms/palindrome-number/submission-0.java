class Solution {
    public boolean isPalindrome(int x) {
        StringBuilder s = new StringBuilder();
        s.append(x);
        return s.reverse().toString().equals(x+"");
        
    }
}