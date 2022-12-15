package LeetCode;

/**
 * 最大正方形
 *
 * @author xoke
 * @date 2022/12/15
 */
public class _221_maximalSquare {
    /**
     * 执行用时：6 ms, 在所有 Java 提交中击败了90.33%的用户
     * 内存消耗：52.3 MB, 在所有 Java 提交中击败了92.23%的用户
     */
    public int maximalSquare(char[][] matrix) {
        // 判空
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return 0;
        }
        // 开始动规
        int row = matrix.length, col = matrix[0].length;
        int[][] dp = new int[row][col];
        int max = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (matrix[i][j] == '1') {
                    if (i == 0 || j == 0) {
                        dp[i][j] = 1;
                    } else {
                        dp[i][j] = Math.min(Math.min(dp[i - 1][j], dp[i][j - 1]), dp[i - 1][j - 1]) + 1;
                    }
                    max = Math.max(dp[i][j], max);
                }
            }
        }
        return max * max;
    }
}
