package LeetCode.CodeCarl.backtrack;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * 重新安排行程
 *
 * @author xoke
 * @date 2022/11/23
 */
public class _332_findItinerary {
    /**
     * 执行用时：18 ms, 在所有 Java 提交中击败了14.93%的用户
     * 内存消耗：41.7 MB, 在所有 Java 提交中击败了96.98%的用户
     */
    LinkedList<String> list;
    LinkedList<String> path = new LinkedList<>();

    public List<String> findItinerary(List<List<String>> tickets) {
        // 先按字母顺序进行排序
        Collections.sort(tickets, (a, b) -> a.get(1).compareTo(b.get(1)));
        // 添加起点
        path.add("JFK");
        boolean[] used = new boolean[tickets.size()];
        backing(tickets, used);
        return list;
    }

    public boolean backing(List<List<String>> tickets, boolean[] used) {
        // 如果机场个数为航班加一，说明找到了一条通路，直接进行返回true
        if (path.size() == tickets.size() + 1) {
            list = new LinkedList<>(path);
            return true;
        }
        for (int i = 0; i < tickets.size(); i++) {
            // 该行程未被访问过 && 该行程的起点为上一行程的终点
            if (!used[i] && path.getLast().equals(tickets.get(i).get(0))) {
                // 将该行程的终点加入路径中
                path.add(tickets.get(i).get(1));
                // 标记一下
                used[i] = true;
                // 如果符合条件，直接返回true
                if (backing(tickets, used)) {
                    return true;
                }
                // 不符合条件，进行回溯
                used[i] = false;
                path.removeLast();
            }
        }
        return false;
    }
}
