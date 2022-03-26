package LeetCode;

import java.util.Stack;

/**
 * 逆波兰表达式求值
 */
public class _150_evalRPN {
    /**
     * 执行用时：5 ms, 在所有 Java 提交中击败了93.10%的用户
     * 内存消耗：40.9 MB, 在所有 Java 提交中击败了47.18%的用户
     * <p>
     * 用栈解决，感觉挺简单的，可能有点冗余，也不想改了
     */
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for (String str : tokens) {
            switch (str) {
                case "+":
                    int a = stack.pop();
                    int b = stack.pop();
                    stack.push(a + b);
                    break;
                case "-":
                    int c = stack.pop();
                    int d = stack.pop();
                    stack.push(d - c);
                    break;
                case "*":
                    int e = stack.pop();
                    int f = stack.pop();
                    stack.push(e * f);
                    break;
                case "/":
                    int g = stack.pop();
                    int h = stack.pop();
                    stack.push(h / g);
                    break;
                default:
                    stack.push(Integer.parseInt(str));
                    break;
            }
        }
        return stack.pop();
    }
}
