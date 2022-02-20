package LeetCode;

import java.util.Stack;

/**
 * 有效的括号
 */
public class _20_isValid {
    public static void main(String[] args) {
        System.out.println(isValid("()(){{}[]}"));
    }
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(') {
                stack.push(')');
            } else if (c == '[') {
                stack.push(']');
            } else if (c == '{') {
                stack.push('}');
            } else if (stack.isEmpty() || c != stack.pop()) {
                return false;
            }
        }
        return stack.isEmpty();
    }
}

