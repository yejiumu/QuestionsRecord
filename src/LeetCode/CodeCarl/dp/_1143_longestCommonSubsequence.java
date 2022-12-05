package LeetCode.CodeCarl.dp;

/**
 * 最长公共子序列
 *
 * @author xoke
 * @date 2022/12/5
 */
public class _1143_longestCommonSubsequence {
    /**
     * 执行用时：7 ms, 在所有 Java 提交中击败了90.95%的用户
     * 内存消耗：45.2 MB, 在所有 Java 提交中击败了46.83%的用户
     */
    public int longestCommonSubsequence(String text1, String text2) {
        int len1 = text1.length(), len2 = text2.length();
        int[][] dp = new int[len1 + 1][len2 + 1];
        for (int i = 1; i <= len1; i++) {
            char t1 = text1.charAt(i - 1);
            for (int j = 1; j <= len2; j++) {
                if (text2.charAt(j - 1) == t1) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }
        return dp[len1][len2];
    }
}
