package LeetCode;

import java.util.Deque;
import java.util.LinkedList;

/**
 * 最小栈
 */
public class _155_MinStack {
    /**
     * 执行用时：4 ms, 在所有 Java 提交中击败了93.32%的用户
     * 内存消耗：43.1 MB, 在所有 Java 提交中击败了62.19%的用户
     */
    class MinStack {

        // 一个真实的栈和一个与之对应位置的最小数栈
        Deque<Integer> stack;
        Deque<Integer> minStack;

        public MinStack() {
            stack = new LinkedList<>();
            minStack = new LinkedList<>();
            // 先用最大数铺个底
            minStack.push(Integer.MAX_VALUE);
        }

        public void push(int val) {
            stack.push(val);
            // 将最小数加入最小数栈中
            minStack.push(Math.min(minStack.peek(), val));
        }

        public void pop() {
            // 将两个都pop出去
            stack.pop();
            minStack.pop();
        }

        public int top() {
            // 这是返回真实栈中的栈顶
            return stack.peek();
        }

        public int getMin() {
            // 返回栈中的最小数，即最小数栈的栈顶
            return minStack.peek();
        }
    }
}
