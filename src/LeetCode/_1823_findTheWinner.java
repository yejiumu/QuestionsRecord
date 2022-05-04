package LeetCode;

import java.util.ArrayDeque;
import java.util.Queue;

public class _1823_findTheWinner {
    /**
     * 执行用时：28 ms, 在所有 Java 提交中击败了21.97%的用户
     * 内存消耗：38.4 MB, 在所有 Java 提交中击败了53.30%的用户
     */
//    public int findTheWinner(int n, int k) {
//        // 创建对列，存储约瑟夫环中的元素
//        Queue<Integer> queue = new ArrayDeque<>();
//        for (int i = 1; i <= n; i++) {
//            queue.offer(i);
//        }
//        // 当只有一个元素时退出循环
//        while (queue.size() > 1) {
//            // 前k - 1个取出后重新返回到队尾(当做循环)
//            for (int i = 1; i < k; i++) {
//                queue.offer(queue.poll());
//            }
//            // 推出此时的第一个元素(也就是第k个元素)
//            queue.poll();
//        }
//        // 返回此时的对首
//        return queue.peek();
//    }
    /**
     * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
     * 内存消耗：38.1 MB, 在所有 Java 提交中击败了89.26%的用户
     *
     * 递归
     */
//    public int findTheWinner(int n, int k) {
//        if (n == 1) {
//            return 1;
//        }
//        return (k + findTheWinner(n - 1, k) - 1) % n + 1;
//    }

    /**
     * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
     * 内存消耗：38.1 MB, 在所有 Java 提交中击败了87.88%的用户
     * <p>
     * 迭代，减少了空间消耗
     */
    public int findTheWinner(int n, int k) {
        int winner = 1;
        for (int i = 2; i <= n; i++) {
            winner = (k + winner - 1) % i + 1;
        }
        return winner;
    }
}
