package LeetCode;

import java.util.PriorityQueue;

public class _1046_lastStoneWeight {
    /**
     * 执行用时：1 ms, 在所有 Java 提交中击败了82.70%的用户
     * 内存消耗：38.6 MB, 在所有 Java 提交中击败了90.85%的用户
     * <p>
     * 每次操作都需要进行排序的时候考虑优先对列，自动进行排序
     */
    public int lastStoneWeight(int[] stones) {
        // 创建优先对列，并制定规则从大到小排序
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> b - a);
        // 将数组中的元素存入优先队列中
        for (int stone : stones) {
            pq.offer(stone);
        }
        // 对列中至少还存在两个元素
        while (pq.size() > 1) {
            // 取出两个最大的元素
            int a = pq.poll();
            int b = pq.poll();
            // 如果有较大者
            if (a > b) {
                // 相减后再存入对列中
                pq.offer(a - b);
            }
            // 如果没有不需要存入
        }
        // 如果是最后两个相等，对列会为空，还要进行判断
        return pq.isEmpty() ? 0 : pq.poll();
    }
}
