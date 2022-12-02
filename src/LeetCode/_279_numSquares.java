package LeetCode;

/**
 * 完全平方数
 */
public class _279_numSquares {
    /**
     * 执行用时：19 ms, 在所有 Java 提交中击败了95.03%的用户
     * 内存消耗：40.8 MB, 在所有 Java 提交中击败了20.81%的用户
     * <p>
     * 很妙，但是还是不懂动规😭
     * <p>
     * 过去的我，2022/12/2的我懂了😆
     */
    public int numSquares(int n) {
        int[] dp = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            int min = Integer.MAX_VALUE;
            // 直接从1开始进行枚举拥有的最小完全平方数
            for (int j = 1; j * j <= i; j++) {
                //动态规划公式
                min = Math.min(min, dp[i - j * j]);
            }
            dp[i] = min + 1;
        }
        return dp[n];
    }
}
