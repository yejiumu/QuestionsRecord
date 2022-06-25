package LeetCode;

import java.util.Arrays;

/**
 * 无重叠区间
 */
public class _435_eraseOverlapIntervals {
    public int eraseOverlapIntervals(int[][] intervals) {
        // 按右端点从小到大排序
        Arrays.sort(intervals, (a, b) -> a[1] - b[1]);
        int len = intervals.length;
        // 一定有一个未覆盖
        int ans = 1;
        // 从最小右端开始
        int end = intervals[0][1];
        for (int i = 1; i < len; i++) {
            if (end <= intervals[i][0]) {
                // 如果找到未覆盖的范围，ans自增
                ++ans;
                // 并将右端点进行更新
                end = intervals[i][1];
            }
        }
        // 题目要求覆盖数组
        return len - ans;
    }
}
