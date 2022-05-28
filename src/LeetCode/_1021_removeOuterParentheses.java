package LeetCode;

import java.util.Stack;

/**
 * 删除最外层的括号
 */
public class _1021_removeOuterParentheses {
    /**
     * 执行用时：6 ms, 在所有 Java 提交中击败了36.96%的用户
     * 内存消耗：41.3 MB, 在所有 Java 提交中击败了40.62%的用户
     */
    public String removeOuterParentheses(String s) {
        // 字符串连接用String三兄弟最快的
        StringBuilder str = new StringBuilder();
        // 括号匹配用栈
        Stack<Character> stack = new Stack<>();
        for (char ch : s.toCharArray()) {
            // 将括号成对抵消
            if (ch == ')') {
                stack.pop();
            }
            // 只要栈中有元素，就连接该字符
            // 在每一个分解后的括号组中，一定会有一个(无法加入栈中，即肯定也会有一个)无法加入
            // 所以这要就去除了最外层括号
            if (!stack.isEmpty()) {
                str.append(ch);
            }
            if (ch == '(') {
                stack.push(ch);
            }
        }
        return str.toString();
    }
}
