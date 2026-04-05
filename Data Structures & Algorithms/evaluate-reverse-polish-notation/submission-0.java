class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> operators = new Stack<>();
        for(int i = 0; i < tokens.length; i++) {
            String token = tokens[i];
            if(token.equals("+")) {
                int op1 = operators.pop();
                operators.push(op1 + operators.pop());
            } else if(token.equals("*")) {
                int op1 = operators.pop();
                operators.push(op1 * operators.pop());
            } else if(token.equals("-")) {
                int op1 = operators.pop();
                operators.push(op1 - operators.pop());
            } else if(token.equals("-")) {
                int op1 = operators.pop();
                operators.push(op1 / operators.pop());
            } else {
                operators.push(Integer.valueOf(token));
            }
        }
        return operators.pop();
    }
}
