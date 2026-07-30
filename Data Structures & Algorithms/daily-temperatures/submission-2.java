class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<day> daysCalculatingStack = new Stack<>();

        int res[] = new int[temperatures.length];

        for(int e = 0 ; e < temperatures.length; e++){

            while(!daysCalculatingStack.isEmpty() && temperatures[e] > daysCalculatingStack.peek().temp){
                day peekedDay = daysCalculatingStack.pop();
                res[peekedDay.position] = e - peekedDay.position; 
            }

            daysCalculatingStack.push(new day(e, temperatures[e]));
        }

        return res;
    }
}

class day {
    public int  position;
    public int temp;
    public day(int position, int temp ){
        this.position = position;
        this.temp = temp;
    }
}
