package LeetCode;

import java.util.Stack;

/**
 * 用栈实现队列
 */
public class _232_MyQueue {
    Stack<Integer> s1 = new Stack<>();
    Stack<Integer> s2 = new Stack<>();
//    public MyQueue() {
//
//    }

    public void push(int x) {
        s1.push(x);
    }

    public int pop() {
        return 0;
    }

    public int peek() {
        return 0;
    }

    public boolean empty() {
        return s1.empty() && s2.empty();
    }

}