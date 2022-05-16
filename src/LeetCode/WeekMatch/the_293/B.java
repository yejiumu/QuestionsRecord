package LeetCode.WeekMatch.the_293;

import java.util.Arrays;

/**
 * 不含特殊楼层的最大连续楼层数
 */
public class B {
    public int maxConsecutive(int bottom, int top, int[] special) {
        // 首先排序，便于计算
        Arrays.sort(special);
        int len = special.length;
        // 从初始楼层到第一个特殊楼层之间的距离
        int ans = Math.max(special[0] - bottom, 0);
        for (int i = 1; i < len; i++) {
            // 比较每个特殊楼层之间的距离
            ans = Math.max(special[i] - special[i - 1] - 1, ans);
        }
        // 其中最大值与最后一个特殊楼层和最终楼层之间的距离比较
        return Math.max(ans, top - special[len - 1]);
    }
}
