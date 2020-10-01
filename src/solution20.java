import java.util.Stack;

public class solution20 {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }
                if (c == ')' && stack.peek() != '(') {
                    return false;
                }
                if (c == '}' && stack.peek() != '{') {
                    return false;
                }
                if (c == ']' && stack.peek() != '[') {
                    return false;
                }
                stack.pop();
            }
        }
        return stack.isEmpty();
        // Stack<Character> stack = new Stack<Character>();
        // for (char c : s.toCharArray()) {
        // if (c == '(')
        // stack.push(')');
        // else if (c == '{')
        // stack.push('}');
        // else if (c == '[')
        // stack.push(']');
        // else if (stack.isEmpty() || stack.pop() != c)
        // return false;
        // }
        // return stack.isEmpty();
    }

    public static void main(String[] args) {
        solution20 s = new solution20();
        System.out.println(s.isValid("(){}[]"));
    }
}