class Solution {
    public boolean isValid(String s) {
        if(s.isEmpty()) {
            return true;
        }
        Stack<Character> brackets = new Stack<>();
        brackets.push(s.charAt(0));
        for(int i = 1; i < s.length(); i++) {
            if(matches(brackets.peek(),s.charAt(i))) {
                brackets.pop();
            } else {
                brackets.push(s.charAt(i));
            }
        }
        if(brackets.isEmpty()) {
            return true;
        }
        return false;
    }
    private boolean matches(Character char1, Character char2) {
        if(char1 == '(' && char2 == ')') {
            return true;
        }
        if(char1 == '[' && char2 == ']') {
            return true;
        }
        if(char1 == '{' && char2 == '}') {
            return true;
        }
        return false;
    }
}
