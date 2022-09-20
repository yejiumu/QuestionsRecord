package LeetCode;

/**
 * 最小路径和
 *
 * @author xoke
 * @date 2022/9/20
 */
public class _64_minPathSum {
    /**
     * 执行用时：2 ms, 在所有 Java 提交中击败了94.57%的用户
     * 内存消耗：43.8 MB, 在所有 Java 提交中击败了83.39%的用户
     */
    public int minPathSum(int[][] grid) {
        // 初始化
        int n = grid.length, m = grid[0].length;
        int[][] dp = new int[n][m];
        dp[0][0] = grid[0][0];
        // 初始化边界
        for (int i = 1; i < n; i++) {
            dp[i][0] = dp[i - 1][0] + grid[i][0];
        }
        for (int j = 1; j < m; j++) {
            dp[0][j] = dp[0][j - 1] + grid[0][j];
        }
        // 当前点的值为上方和左方的较小值加上当前位置原本的值
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < m; j++) {
                dp[i][j] = Math.min(dp[i - 1][j], dp[i][j - 1]) + grid[i][j];
            }
        }
        // 返回最右下角的值即可
        return dp[n - 1][m - 1];
    }
}
