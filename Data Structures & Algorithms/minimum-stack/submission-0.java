class MinStack {

    List<Integer> mainStack;
    List<Integer> minUpto;
    int min = 0;

    public MinStack() {
        mainStack = new ArrayList<>();
        minUpto = new ArrayList<>();
    }
    
    public void push(int val) {
        if(mainStack.size() == 0) {
            min = val;
        }
        if(val < min) {
            min = val;
        }
        mainStack.add(val);
        minUpto.add(min);
    }
    
    public void pop() {
        mainStack.remove(mainStack.size()-1);
        minUpto.remove(minUpto.size()-1);
        min = minUpto.get(minUpto.size()-1);
    }
    
    public int top() {
       return mainStack.get(mainStack.size()-1);
    }
    
    public int getMin() {
        return min;
    }
}
