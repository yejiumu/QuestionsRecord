package LeetCode.CodeCarl.stackqueue;

import java.util.Objects;
import java.util.Stack;

/**
 * 逆波兰表达式求值
 *
 * @author xoke
 * @date 2022/11/8
 */
public class _150_evalRPN {
    /**
     * 执行用时：5 ms, 在所有 Java 提交中击败了93.28%的用户
     * 内存消耗：41.2 MB, 在所有 Java 提交中击败了42.40%的用户
     */
    public int evalRPN(String[] tokens) {
        Stack<String> stack = new Stack<>();
        for (String s : tokens) {
            switch (s) {
                case "+": {
                    int a = Integer.parseInt(stack.pop());
                    int b = Integer.parseInt(stack.pop());
                    stack.push(Integer.toString(a + b));
                    break;
                }
                case "-": {
                    int a = Integer.parseInt(stack.pop());
                    int b = Integer.parseInt(stack.pop());
                    stack.push(Integer.toString(a - b));
                    break;
                }
                case "*": {
                    int a = Integer.parseInt(stack.pop());
                    int b = Integer.parseInt(stack.pop());
                    stack.push(Integer.toString(a * b));
                    break;
                }
                case "/": {
                    int a = Integer.parseInt(stack.pop());
                    int b = Integer.parseInt(stack.pop());
                    stack.push(Integer.toString(a / b));
                    break;
                }
                default:
                    stack.push(s);
                    break;
            }
        }
        return Integer.parseInt(stack.pop());
    }
}
