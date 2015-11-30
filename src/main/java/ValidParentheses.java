import java.util.Stack;

public class ValidParentheses {
    public boolean isValid(String s) {
        if (s == null || s.isEmpty()) {
            return true;
        }
        
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (isLeft(c)) {
                stack.push(c);
            } else {
                if (stack.isEmpty() || !stack.pop().equals(getLeft(c))) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    private char getLeft(char c) {
        switch (c) {
            case ')' : return '(';
            case ']' : return '[';
            case '}' : return '{';
            default : throw new RuntimeException();
        }
    }

    private boolean isLeft(char c) {
        return c == '(' || c == '[' || c == '{';
    }
}
