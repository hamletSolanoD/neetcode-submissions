class Solution {
    public int calculateTime(String keyboard, String word) {
        HashMap<Character, Integer> orderMap = new HashMap<>();
        for(int e = 0; e < keyboard.length(); e++){
            orderMap.put(keyboard.charAt(e),e);
        }
        int counter = 0;
        int currentPosition = 0;
        for(char a : word.toCharArray()){
            counter += Math.abs(orderMap.get(a) - currentPosition);
            currentPosition = orderMap.get(a);
        }
        return counter;
    }
}
