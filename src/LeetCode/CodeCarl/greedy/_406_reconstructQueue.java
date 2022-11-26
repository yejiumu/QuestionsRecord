package LeetCode.CodeCarl.greedy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * 根据身高重建队列
 *
 * @author xoke
 * @date 2022/11/26
 */
public class _406_reconstructQueue {
    /**
     * 执行用时：7 ms, 在所有 Java 提交中击败了65.49%的用户
     * 内存消耗：42.1 MB, 在所有 Java 提交中击败了75.05%的用户
     */
    public int[][] reconstructQueue(int[][] people) {
        // 首先按身高从大到小排序，身高相等的按序号排
        // 这样保证了每个位置的前面的人都是
        Arrays.sort(people, (a, b) -> {
            if (a[0] == b[0]) {
                return a[1] - b[1];
            }
            return b[0] - a[0];
        });
        // 然后按数组中的序号进行插入链表
        // 优先按身高高的people的k来插入，后序插入节点也不会影响前面已经插入的节点
        LinkedList<int[]> list = new LinkedList<>();
        for (int[] p : people) {
            list.add(p[1], p);
        }
        return list.toArray(new int[people.length][]);
    }
}
