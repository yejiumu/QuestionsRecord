package LeetCode;

import java.util.ArrayDeque;
import java.util.Queue;

public class _933_RecentCounter {
    /**
     * 执行用时：19 ms, 在所有 Java 提交中击败了86.18%的用户
     * 内存消耗：49 MB, 在所有 Java 提交中击败了90.37%的用户
     */
    class RecentCounter {

        // 严格单调递增，用对列
        Queue<Integer> queue;

        public RecentCounter() {
            // 初始化对列
            queue = new ArrayDeque<>();
        }

        public int ping(int t) {
            // 先加入对列
            queue.offer(t);
            // 如果对首不在范围内，直接poll出
            // 因为此时都不在范围内，后面的数肯定比现在的这个数更大
            // 所以可以直接丢出去
            while (queue.peek() < t - 3000) {
                queue.poll();
            }
            // 返回此时对列的个数即可
            return queue.size();
        }
    }
}
