package LeetCode.CodeCarl.dp;

/**
 * 不同的子序列
 *
 * @author xoke
 * @date 2022/12/6
 */
public class _115_numDistinct {
    /**
     * 执行用时：10 ms, 在所有 Java 提交中击败了82.55%的用户
     * 内存消耗：48.6 MB, 在所有 Java 提交中击败了40.28%的用户
     */
    public int numDistinct(String s, String t) {
        int sl = s.length(), tl = t.length();
        int[][] dp = new int[sl + 1][tl + 1];
        for (int i = 0; i <= sl; i++) {
            dp[i][0] = 1;
        }
        for (int i = 1; i <= sl; i++) {
            // 这里进行优化剪枝，j > i就没有必要再进行操作了，默认次数为0
            for (int j = 1; j <= tl && j <= i; j++) {
                if (s.charAt(i - 1) == t.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] + dp[i - 1][j];
                } else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }
        return dp[sl][tl];
    }
}
