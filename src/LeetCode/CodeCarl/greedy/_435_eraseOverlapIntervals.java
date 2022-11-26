package LeetCode.CodeCarl.greedy;

import java.util.Arrays;

/**
 * 无重叠区间
 *
 * @author xoke
 * @date 2022/11/26
 */
public class _435_eraseOverlapIntervals {
    /**
     * 执行用时：50 ms, 在所有 Java 提交中击败了53.99%的用户
     * 内存消耗：98.1 MB, 在所有 Java 提交中击败了18.44%的用户
     */
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[1], b[1]));
        int res = 1, len = intervals.length;
        for (int i = 1; i < len; i++) {
            if (intervals[i][0] >= intervals[i - 1][1]) {
                res++;
            } else {
                intervals[i][1] = Math.min(intervals[i - 1][1], intervals[i][1]);
            }
        }
        return len - res;
    }
}
