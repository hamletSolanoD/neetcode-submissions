class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for(char e : s.toCharArray()){
            if(e == '(' || e == '[' || e == '{') stack.push(e);
            else{
                if(stack.isEmpty()) return false;
                else if(e == ')' && stack.peek() == '(') stack.pop();
                else if(e == ']' && stack.peek() == '[') stack.pop();
                else if(e == '}' && stack.peek() == '{') stack.pop();
                else {
                    return false;
                }

            }
        }
        return stack.isEmpty();
        
    }
}
