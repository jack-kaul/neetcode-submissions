class MyQueue {
    Stack<Integer> mainStack;
    Stack<Integer> helper;

    public MyQueue() {
        mainStack = new Stack<>();
        helper = new Stack<>();
    }
    
    public void push(int x) {
        helper.push(x);
        while(!mainStack.isEmpty()) {
            helper.push(mainStack.pop());
        }
        Stack<Integer> temp = mainStack;
        mainStack = helper;
        helper = temp;
    }
    
    public int pop() {
        return mainStack.pop();
    }
    
    public int peek() {
        return mainStack.peek();
    }
    
    public boolean empty() {
        return mainStack.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */