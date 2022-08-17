package LeetCode.剑指offer.I;

/**
 * 礼物的最大价值
 *
 * @author xoke
 * @date 2022/8/17
 */
public class _47_maxValue {
    /**
     * 执行用时：2 ms, 在所有 Java 提交中击败了97.66%的用户
     * 内存消耗：43.9 MB, 在所有 Java 提交中击败了66.13%的用户
     */
    public int maxValue(int[][] grid) {
        int m = grid.length, n = grid[0].length;
        // 先初始化边界
        // 初始化第一列
        for (int i = 1; i < m; i++) {
            grid[i][0] += grid[i - 1][0];
        }
        // 初始化第一行
        for (int i = 1; i < n; i++) {
            grid[0][i] += grid[0][i - 1];
        }
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                // 累加上面和左边的最大值
                grid[i][j] += Math.max(grid[i - 1][j], grid[i][j - 1]);
            }
        }
        // 直接返回终点的值即可
        return grid[m - 1][n - 1];
    }
}
