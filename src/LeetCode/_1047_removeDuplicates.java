package LeetCode;

import java.util.Stack;

/**
 * 删除字符串中的所有相邻重复项
 */
public class _1047_removeDuplicates {
    /**
     * 执行用时：78 ms, 在所有 Java 提交中击败了45.74%的用户
     * 内存消耗：42 MB, 在所有 Java 提交中击败了49.47%的用户
     */
//    public String removeDuplicates(String s) {
//        Stack<Character> stack = new Stack<>();
//        int len = s.length();
//        for (int i = 0; i < len; i++) {
//            char ch = s.charAt(i);
//            if (stack.isEmpty() || ch != stack.peek()) {
//                stack.push(ch);
//            } else {
//                stack.pop();
//            }
//        }
//        StringBuilder str = new StringBuilder();
//        while (!stack.isEmpty()) {
//            str.append(stack.pop());
//        }
//        return str.reverse().toString();
//    }

    /**
     * 执行用时：9 ms, 在所有 Java 提交中击败了88.51%的用户
     * 内存消耗：41.9 MB, 在所有 Java 提交中击败了57.35%的用户
     */
    public String removeDuplicates(String s) {
        // String三兄弟最快的，没想到String也可以当做栈使用，还有栈的相关函数
        StringBuilder stack = new StringBuilder();
        // 栈顶元素的位置
        int top = -1;
        int len = s.length();
        // 遍历字符串
        for (int i = 0; i < len; i++) {
            // 取出当前字符
            char ch = s.charAt(i);
            // 如果栈不为空且栈顶字符等于该字符
            if (top >= 0 && stack.charAt(top) == ch) {
                // 将栈顶元素删除
                stack.deleteCharAt(top);
                // 栈顶下移
                --top;
            } else {
                // 否则将入栈中
                stack.append(ch);
                // 栈顶上移
                ++top;
            }
        }
        // 返回字符串形式
        return stack.toString();
    }
}
