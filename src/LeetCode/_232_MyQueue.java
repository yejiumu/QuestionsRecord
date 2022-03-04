package LeetCode;

import java.util.Stack;

/**
 * 用栈实现队列
 */
public class _232_MyQueue {
    /**
     * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
     * 内存消耗：39.1 MB, 在所有 Java 提交中击败了26.78%的用户
     */
    class MyQueue {
        //s1用来入栈，即push进的是s1
        private final Stack<Integer> s1 = new Stack<>();
        //s2用来出栈，即从s2pop出
        private final Stack<Integer> s2 = new Stack<>();
        //用来标记队列最前的元素
        int front;

        public MyQueue() {

        }

        public void push(int x) {
            if (s1.isEmpty()) {
                //此时是s1中的第一个元素，标记为front
                front = x;
            }
            //将x压入s1
            s1.push(x);
        }

        //如果s2本来是有元素的，再调用时，时间复杂度O(1)，所以摊还复杂度为O(1)
        public void pop() {
            //如果s2是空的，就将s1中的所有元素压入s2
            if (s2.isEmpty()) {
                while (!s1.isEmpty()) {
                    s2.push(s1.pop());
                }
            }
            //然后直接pop；不为空也是直接pop
            s2.pop();
        }

        public int peek() {
            //如果s2不为空，s2的栈顶元素才是队列的第一个元素
            if (!s2.isEmpty()) {
                return s2.peek();
            }
            //如果s2为空，返回标记的s1中的元素
            return front;
        }

        public boolean empty() {
            //两个栈为空才是真的空
            return s1.empty() && s2.empty();
        }
    }
}