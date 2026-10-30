import java.util.Stack;

class Solution {
    public boolean isValid(String s) {

        int n = s.length();
        if( n%2 != 0){
            return false;
        }

        Stack<Character> stack = new Stack<>();

        for( char ch : s.toCharArray()){

            if( ch == '(') {
                stack.push(')');
            } else if ( ch == '{'){
                stack.push('}');
            } else if( ch == '['){
                stack.push(']');
            } else if ( stack.isEmpty() || stack.pop() != ch){
                return false;
            }
        }

        return stack.isEmpty();
        
    }
}