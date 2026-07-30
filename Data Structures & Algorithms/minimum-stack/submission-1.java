class MinStack {
    private Stack<Integer> internalStack;
    private Stack<Integer> internalMinStack;

    public MinStack() {
        internalStack = new Stack<>();
        internalMinStack = new Stack<>();
        internalStack.push(0);
        internalMinStack.push(Integer.MAX_VALUE);
    }

    
    public void push(int val) {
        internalStack.push(val);
        if(val <= internalMinStack.peek()) internalMinStack.push(val);
    }
    
    public void pop() {
        if(internalMinStack.peek().equals(internalStack.peek())) {
            internalMinStack.pop();
        }
        internalStack.pop();
    }
    
    public int top() {
        return internalStack.peek();
    }
    
    public int getMin() {
        return internalMinStack.peek();    
    }
}
