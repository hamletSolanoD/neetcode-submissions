class Solution {
    private boolean stringIsNumber(String s){
        try{
            Integer.parseInt(s);
            return true;
        }catch(Exception e){
            return false;
        }
    }

    public int evalRPN(String[] tokens) {
        Stack<Integer> numbers = new Stack<Integer>();
        for(String e : tokens){
            if(stringIsNumber(e)){
                numbers.push(Integer.parseInt(e));
            }
            else{
                int secondOp = numbers.pop();
                int firstOp = numbers.pop();
                switch(e){
                    case "-": numbers.push(firstOp - secondOp); break;
                    case "+": numbers.push(firstOp + secondOp); break;
                    case "/": numbers.push(firstOp / ( secondOp == 0 ? 1 : secondOp));  break;
                    case "*": numbers.push(firstOp * secondOp); break; 
                }
            }
        }
        return numbers.pop();
    }
}
