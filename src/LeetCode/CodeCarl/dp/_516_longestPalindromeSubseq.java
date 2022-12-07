package LeetCode.CodeCarl.dp;

/**
 * 最长回文子序列
 *
 * @author xoke
 * @date 2022/12/7
 */
public class _516_longestPalindromeSubseq {
    /**
     * 执行用时：34 ms, 在所有 Java 提交中击败了61.71%的用户
     * 内存消耗：50.6 MB, 在所有 Java 提交中击败了55.71%的用户
     */
    public int longestPalindromeSubseq(String s) {
        int len = s.length();
        int[][] dp = new int[len][len];
        for (int i = 0; i < len; i++) {
            dp[i][i] = 1;
        }
        for (int i = len - 1; i >= 0; i--) {
            for (int j = i + 1; j < len; j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    dp[i][j] = dp[i + 1][j - 1] + 2;
                } else {
                    dp[i][j] = Math.max(dp[i + 1][j], Math.max(dp[i][j - 1], dp[i][j]));
                }
            }
        }
        return dp[0][len - 1];
    }
}
