package LeetCode.CodeCarl.greedy;

import java.util.Arrays;
import java.util.Comparator;

/**
 * 用最少数量的箭引爆气球
 *
 * @author xoke
 * @date 2022/11/26
 */
public class _452_findMinArrowShots {
    /**
     * 执行用时：54 ms, 在所有 Java 提交中击败了71.06%的用户
     * 内存消耗：78.2 MB, 在所有 Java 提交中击败了18.59%的用户
     */
    public int findMinArrowShots(int[][] points) {
        // 这里不能直接使用两者相减的返回值，一个极小减极大会溢出
//        Arrays.sort(points, (a, b) -> a[0] < b[0] ? -1 : 1);
        // 以后记下面这个，通用
        Arrays.sort(points, (a, b) -> Integer.compare(a[0], b[0]));
        // points 不为空至少需要一支箭
        int res = 1, len = points.length;
        for (int i = 1; i < len; i++) {
            // 气球i和气球i-1不挨着，注意这里不是 >=
            if (points[i][0] > points[i - 1][1]) {
                // 需要一支箭
                res++;
            } else {
                // 球i和气球i-1挨着
                // 更新重叠气球最小右边界
                points[i][1] = Math.min(points[i - 1][1], points[i][1]);
            }
        }
        return res;
    }
}
