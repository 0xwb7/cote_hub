import java.util.Stack;

class Solution {
    public static boolean solution(String s) {
        Stack<String> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            if (!stack.isEmpty() && s.charAt(i) == ')') {
                stack.pop();
            } else {
                stack.push(String.valueOf(s.charAt(i)));
            }
        }
        
        return stack.isEmpty();
    }
}