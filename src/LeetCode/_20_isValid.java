package LeetCode;

import java.util.Stack;

/**
 * 有效的括号
 */
public class _20_isValid {
    /**
     * 执行用时：1 ms, 在所有 Java 提交中击败了98.78%的用户
     * 内存消耗：39.5 MB, 在所有 Java 提交中击败了21.48%的用户
     */
    public boolean isValid(String s) {
        //创建栈，利用栈的特性
        Stack<Character> stack = new Stack<>();
        for (char ch : s.toCharArray()) {
            //如果是左括号，就压入对应的右括号
            if (ch == '(') {
                stack.push(')');
            } else if (ch == '[') {
                stack.push(']');
            } else if (ch == '{') {
                stack.push('}');
            } else
                //如果不是左括号，就先判断是否栈空，防止空指针异常，
                //然后将出栈的元素与该右括号进行比较，如果不相等直接返回false
                if (stack.isEmpty() || ch != stack.pop()) {
                    return false;
                }
        }
        //判断栈是否为空，有的是单个括号，无法全部消除(出栈)
        return stack.isEmpty();
    }
}

