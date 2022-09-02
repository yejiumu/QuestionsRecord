package LeetCode;

/**
 * 矩阵区域和
 *
 * @author xoke
 * @date 2022/9/2
 */
public class _1314_matrixBlockSum {
    /**
     * 执行用时：3 ms, 在所有 Java 提交中击败了97.01%的用户
     * 内存消耗：42.1 MB, 在所有 Java 提交中击败了65.30%的用户
     */
    public int[][] matrixBlockSum(int[][] mat, int k) {
        int n = mat.length, m = mat[0].length;
        // 创建一个新数组，扩宽边界，方便操作
        int[][] dp = new int[n + 1][m + 1];
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                // 二维前缀和
                dp[i][j] = dp[i - 1][j] + dp[i][j - 1] + mat[i - 1][j - 1] - dp[i - 1][j - 1];
            }
        }
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                // 防止数组越界
                int x1 = i - k, y1 = j - k, x2 = i + k, y2 = j + k;
                if (x1 < 1) x1 = 1;
                if (y1 < 1) y1 = 1;
                if (x2 > n) x2 = n;
                if (y2 > m) y2 = m;
                // 计算 i - k <= r <= i + k, j - k <= c <= j + k 范围内的每个数的和
                mat[i - 1][j - 1] = dp[x2][y2] + dp[x1 - 1][y1 - 1] - dp[x1 - 1][y2] - dp[x2][y1 - 1];
            }
        }
        return mat;
    }
}
