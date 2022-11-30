package LeetCode.CodeCarl.dp;

/**
 * 整数拆分
 *
 * @author xoke
 * @date 2022/11/30
 */
class _343_integerBreak {
    /**
     * 执行用时：1 ms, 在所有 Java 提交中击败了79.62%的用户
     * 内存消耗：38.1 MB, 在所有 Java 提交中击败了72.57%的用户
     */
    public int integerBreak(int n) {
        int[] dp = new int[n + 1];
        dp[2] = 1;
        for (int i = 3; i <= n; i++) {
            // 从不同数字开始，更新i的从j开始组成和的数字的最大值积
            for (int j = 1; j <= i / 2; j++) {
                dp[i] = Math.max(dp[i], Math.max(j * (i - j), j * dp[i - j]));
            }
        }
        return dp[n];
    }
}