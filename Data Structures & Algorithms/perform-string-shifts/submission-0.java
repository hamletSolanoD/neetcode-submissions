class Solution {
    public String stringShift(String s, int[][] shift) {
        Deque<Character> dequeString = new ArrayDeque<>();
        for(char a : s.toCharArray()){
            dequeString.addLast(a);
        }
        for(int [] moves : shift) {
            int direction = moves[0];
            int steps = moves[1];
            for(int e = 0; e < steps; e++){
                if(direction != 1){
                    char removed = dequeString.getFirst();
                    dequeString.removeFirst();
                    dequeString.addLast(removed);
                }
                else{
                    char removed = dequeString.getLast();
                    dequeString.removeLast();
                    dequeString.addFirst(removed);
                }
            }
        }
        String finalString = "";
        for(char finalst:dequeString){
            finalString+= ""+finalst;
        }
        return finalString;
    }
}
