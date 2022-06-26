package LeetCode;

import java.util.Arrays;
import java.util.Comparator;

/**
 * 用最少数量的箭引爆气球
 */
public class _452_findMinArrowShots {
    /**
     * 执行用时：51 ms, 在所有 Java 提交中击败了99.90%的用户
     * 内存消耗：78.2 MB, 在所有 Java 提交中击败了16.23%的用户
     */
    public int findMinArrowShots(int[][] points) {
        // 按右区间从小到大排序
        Arrays.sort(points, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return Integer.compare(o1[1], o2[1]);
            }
        });
        // 记录右区间
        int end = points[0][1];
        // 默认有一个
        int ans = 1;
        // 遍历每个区间
        for (int[] balloon : points) {
            // 其实就是找最小[start, end]区间
            if (balloon[0] > end) {
                // 如果左区间大于上场右区间
                // 更新新区间的右区间
                end = balloon[1];
                // 新开区间的数目
                ++ans;
            }
        }
        return ans;
    }
}
