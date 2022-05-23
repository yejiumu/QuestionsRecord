package LeetCode;

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

/**
 * 按递增顺序显示卡牌
 */
public class _950_deckRevealedIncreasing {
    /**
     * 执行用时：4 ms, 在所有 Java 提交中击败了22.56%的用户
     * 内存消耗：41.4 MB, 在所有 Java 提交中击败了59.40%的用户
     */
//    public int[] deckRevealedIncreasing(int[] deck) {
//        Arrays.sort(deck);
//        int len = deck.length;
//        Deque<Integer> index = new LinkedList<>();
//        for (int i = 0; i < len; i++) {
//            index.add(i);
//        }
//        int[] ans = new int[len];
//        for (int card : deck) {
//            ans[index.pollFirst()] = card;
//            if (!index.isEmpty()) {
//                index.add(index.pollFirst());
//            }
//        }
//        return ans;
//    }

    /**
     * 执行用时：3 ms, 在所有 Java 提交中击败了90.60%的用户
     * 内存消耗：41.4 MB, 在所有 Java 提交中击败了59.40%的用户
     */
    public int[] deckRevealedIncreasing(int[] deck) {
        int len = deck.length;
        // 先排序
        Arrays.sort(deck);
        Queue<Integer> queue = new LinkedList<>();
        // 倒序遍历排序后的数组，倒序模拟出栈
        for (int i = len - 1; i >= 0; i--) {
            // 这个是第一次进入，队列为空，向对列中添加元素
            if (queue.isEmpty()) {
                queue.add(deck[i]);
                continue;
            }
            // 将队首放至队尾
            queue.add(queue.poll());
            // 将当前元素加入队列中
            queue.add(deck[i]);
        }
        for (int j = len - 1; j >= 0; j--) {
            // 倒序赋值
            deck[j] = queue.poll();
        }
        // 原地赋值，直接返回deck即可
        return deck;
    }
}
