package LeetCode.剑指offer.I;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

/**
 * 队列的最大值
 *
 * @author jiumu
 * @date 2023/2/17
 */
public class _59_2_MaxQueue {
    /**
     * 执行用时：27 ms, 在所有 Java 提交中击败了36.74%的用户
     * 内存消耗：49 MB, 在所有 Java 提交中击败了81.63%的用户
     */
    class MaxQueue {
        Deque<Integer> d;
        Queue<Integer> q;

        public MaxQueue() {
            d = new LinkedList<>();
            q = new LinkedList<>();
        }

        public int max_value() {
            if (d.isEmpty()) {
                return -1;
            }
            return d.peekFirst();
        }

        public void push_back(int value) {
            while (!d.isEmpty() && d.peekLast() < value) {
                d.pollLast();
            }
            d.offerLast(value);
            q.offer(value);
        }

        public int pop_front() {
            if (q.isEmpty()) {
                return -1;
            }
            int res = q.poll();
            if (res == d.peekFirst()) {
                d.pollFirst();
            }
            return res;
        }
    }
}
