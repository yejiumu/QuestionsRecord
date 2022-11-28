package LeetCode.CodeCarl.greedy;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * 合并区间
 *
 * @author xoke
 * @date 2022/11/28
 */
public class _56_merge {
    /**
     * 执行用时：7 ms, 在所有 Java 提交中击败了71.07%的用户
     * 内存消耗：46.5 MB, 在所有 Java 提交中击败了34.11%的用户
     */
    public int[][] merge(int[][] intervals) {
        List<int[]> list = new LinkedList<>();
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        int start = intervals[0][0];
        int end = intervals[0][1];
        int len = intervals.length;
        for (int i = 1; i < len; i++) {
            if (intervals[i][0] > end) {
                list.add(new int[]{start, end});
                start = intervals[i][0];
                end = intervals[i][1];
            } else {
                end = Math.max(intervals[i][1], end);
            }
        }
        list.add(new int[]{start, end});
        return list.toArray(new int[list.size()][]);
    }
}
