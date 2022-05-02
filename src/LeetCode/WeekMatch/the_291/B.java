package LeetCode.WeekMatch.the_291;

import java.util.*;

/**
 * 必须拿起的最小连续卡牌数
 */
public class B {
    /**
     * 执行用时：78 ms, 在所有 Java 提交中击败了100.00%的用户
     * 内存消耗：70.7 MB, 在所有 Java 提交中击败了100.00%的用户
     */
    public int minimumCardPickup(int[] cards) {
        // 直接哈希表
        Map<Integer, List<Integer>> map = new HashMap<>();
        int len = cards.length;
        for (int i = 0; i < len; i++) {
            // 如果不存在就加入
            if (!map.containsKey(cards[i])) {
                map.put(cards[i], new ArrayList<>());
            }
            // 然后将当前下标加入到当前元素的列表中
            map.get(cards[i]).add(i);
        }
        // 在众多列表中，寻找两两相差最小的距离
        int min = 0x3f3f3f3f;
        for (List<Integer> temp : map.values()) {
            for (int i = 0; i < temp.size() - 1; i++) {
                // 寻找最小值
                min = Math.min(temp.get(i + 1) - temp.get(i) + 1, min);
            }
        }
        return min == 0x3f3f3f3f ? -1 : min;
    }
}
