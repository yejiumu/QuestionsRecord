package LeetCode.CodeCarl.stackqueue;

import java.util.Stack;

/**
 * 删除字符串中的所有相邻重复项
 *
 * @author xoke
 * @date 2022/11/8
 */
public class _1047_removeDuplicates {
    /**
     * 执行用时：50 ms, 在所有 Java 提交中击败了54.29%的用户
     * 内存消耗：42.8 MB, 在所有 Java 提交中击败了32.83%的用户
     */
    public String removeDuplicates(String s) {
        // 这里也可以直接用字符串进行操作，会比用stack快
        // 可以参考 Leetcode/1047
        Stack<Character> stack = new Stack<>();
        for (char ch : s.toCharArray()) {
            if (!stack.isEmpty() && stack.peek() == ch) {
                stack.pop();
            } else {
                stack.push(ch);
            }
        }
        StringBuilder str = new StringBuilder();
        for (char ch : stack) {
            str.append(ch);
        }
        return str.toString();
    }
}
