package LeetCode.剑指offer.I;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;

/**
 * 用两个栈实现队列
 *
 * @author xoke
 * @date 2022/8/9
 */
public class _9_CQueue {
    /**
     * 执行用时：35 ms, 在所有 Java 提交中击败了92.62%的用户
     * 内存消耗：48.1 MB, 在所有 Java 提交中击败了73.13%的用户
     */
    class CQueue {

        Deque<Integer> qa;
        Deque<Integer> qb;

        public CQueue() {
            // 初始化两个栈
            qa = new ArrayDeque<>();
            qb = new ArrayDeque<>();
        }

        public void appendTail(int value) {
            // qa负责添加元素
            qa.add(value);
        }

        public int deleteHead() {
            // 如果qb为空，说明需要进行翻转了
            // 之前存入的队列中的头部已经全部都删除了
            if (qb.isEmpty()) {
                // 如果此时qa也为空，说明没有元素在队列中
                if (qa.isEmpty()) {
                    // 直接返回-1即可
                    return -1;
                }
                // 否则将qa中的元素翻转到qb中去，尾变头
                reverse();
            }
            // 如果qb不为空，直接返回qb的最顶端即可
            return qb.pop();
        }

        public void reverse() {
            // qb负责删除元素
            while (!qa.isEmpty()) {
                // 所以要将qa中的元素进行颠倒后放入qb中
                qb.add(qa.pop());
            }
        }
    }
}
