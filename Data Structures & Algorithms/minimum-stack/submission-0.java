class MinStack {
    private Stack<Integer> stack;
    private Stack<Integer> minStack;
    public MinStack() {
        stack = new Stack(); //  2 1
        minStack = new Stack(); //  1
    }
    
    public void push(int val) {
        if(minStack.isEmpty() || val <= minStack.peek())
        {
            minStack.push(val); // 1
        }

        stack.push(val);
    }
    
    public void pop() {
        int val = stack.pop();
        if(val == minStack.peek())
        {
            minStack.pop();
        }
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        return minStack.peek();
    }
}
