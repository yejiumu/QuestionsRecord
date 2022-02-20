package LeetCode;

import java.util.Stack;

/**
 * 用栈实现队列
 */
public class _232_MyQueue {
    /**
     * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
     * 内存消耗：36.4 MB, 在所有 Java 提交中击败了17.31%的用户
     */
    private final Stack<Integer> a = new Stack<>();// 输入栈
    private final Stack<Integer> b = new Stack<>();// 输出栈

//    public MyQueue() {
//
//    }

    public void push(int x) {
        a.push(x);
    }

    public int pop() {
        // 如果b栈为空，则将a栈全部弹出并压入b栈中，然后b.pop()
        if (b.isEmpty()) {
            while (!a.isEmpty()) {
                b.push(a.pop());
            }
        }
        return b.pop();
    }

    public int peek() {
        if (b.isEmpty()) {
            while (!a.isEmpty()) {
                b.push(a.pop());
            }
        }
        return b.peek();
    }

    public boolean empty() {
        return a.isEmpty() && b.isEmpty();
    }

}