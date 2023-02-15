package LeetCode.剑指offer.I;

import java.util.PriorityQueue;
import java.util.Queue;

/**
 * 数据流中的中位数
 *
 * @author jiumu
 * @date 2023/2/15
 */
public class _41_MedianFinder {
    /**
     * 执行用时：67 ms, 在所有 Java 提交中击败了37.17%的用户
     * 内存消耗：52.1 MB, 在所有 Java 提交中击败了86.81%的用户
     */
    class MedianFinder {
        Queue<Integer> a, b;

        /**
         * initialize your data structure here.
         */
        public MedianFinder() {
            a = new PriorityQueue<>();
            b = new PriorityQueue<>((x, y) -> (y - x));
        }

        public void addNum(int num) {
            if (a.size() != b.size()) {
                a.add(num);
                b.add(a.poll());
            } else {
                b.add(num);
                a.add(b.poll());
            }
        }

        public double findMedian() {
            return a.size() == b.size() ? (a.peek() + b.peek()) / 2.0 : a.peek();
        }
    }
}
