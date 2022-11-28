package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class _56_merge {
    /**
     * 执行用时：7 ms, 在所有 Java 提交中击败了73.65%的用户
     * 内存消耗：46 MB, 在所有 Java 提交中击败了50.56%的用户
     */
    public int[][] merge(int[][] intervals) {
        // 判空
        if (intervals.length == 0) {
            return new int[0][2];
        }
        // 按数组的第一位大小进行排序（从小到大）
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
        // 创建列表进行储存结果
        List<int[]> merged = new ArrayList<>();
        // 遍历数组
        for (int[] interval : intervals) {
            // 记录当前集合的左右区间
            int L = interval[0], R = interval[1];
            // 需要加入列表的判断条件
            // 1、第一个区间  2、当前区间的下限大于前一个区间的上限
            if (merged.size() == 0 || merged.get(merged.size() - 1)[1] < L) {
                merged.add(new int[]{L, R});
            } else {
                // 否则将前一个区间的上限进行更新即可
                merged.get(merged.size() - 1)[1] = Math.max(merged.get(merged.size() - 1)[1], R);
            }
        }
        // 将列表数组化
        return merged.toArray(new int[merged.size()][]);
    }

    public int[][] merge_(int[][] intervals) {
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
