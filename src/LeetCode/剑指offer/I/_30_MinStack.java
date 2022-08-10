package LeetCode.剑指offer.I;

import java.util.Stack;

/**
 * 包含min函数的栈
 *
 * @author xoke
 * @date 2022/8/10
 */
public class _30_MinStack {
    /**
     * 执行用时：13 ms, 在所有 Java 提交中击败了54.94%的用户
     * 内存消耗：43.7 MB, 在所有 Java 提交中击败了17.58%的用户
     */
    class MinStack {
        Stack<Integer> a, b;

        /**
         * initialize your data structure here.
         */
        public MinStack() {
            // 初始化两个栈
            // a为原始所有数据的栈表示
            // b为数据中阶段性的最小值(单调递减或者不变)的栈表示
            a = new Stack<>();
            b = new Stack<>();
        }

        public void push(int x) {
            // a全都要存下
            a.add(x);
            // 只有当b为空，或者此时b栈顶不是阶段最小值后，进行添加
            if (b.isEmpty() || b.peek() >= x) {
                b.add(x);
            }
        }

        public void pop() {
            // a一定要pop出
            // 如果a的栈顶等于b的栈顶，那么b也要pop出
            // 保存a、b中的元素一致性
            if (a.pop().equals(b.peek())) {
                b.pop();
            }
        }

        public int top() {
            // 直接返回a的栈顶
            return a.peek();
        }

        public int min() {
            // 直接返回b的栈顶，就是最小值
            return b.peek();
        }
    }
}
