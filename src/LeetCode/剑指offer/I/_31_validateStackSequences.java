package LeetCode.剑指offer.I;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

/**
 * 栈的压入、弹出序列
 *
 * @author xoke
 * @date 2022/9/2
 */
public class _31_validateStackSequences {
    /**
     * 执行用时：1 ms, 在所有 Java 提交中击败了97.12%的用户
     * 内存消耗：40.9 MB, 在所有 Java 提交中击败了79.68%的用户
     */
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Deque<Integer> stack = new ArrayDeque<>();
        // j 为 popped 出栈顺序
        int len = pushed.length, j = 0;
        for (int k : pushed) {
            // 每一步都将当前元素压入栈中
            stack.push(k);
            // 栈不为空，向前循环检查 popped 的下一元素
            // 这样可以保证连续性
            while (!stack.isEmpty() && popped[j] == stack.peek()) {
                stack.pop();
                j++;
            }
        }
        // 最后直接判断栈是否为空即可
        // 如果 popped 可行，上述循环可以直接将栈全部 pop 出
        // 不行，则栈中一定还有元素
        return stack.isEmpty();
    }
}
